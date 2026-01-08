package dev.freya02.opus.jda;

import net.dv8tion.jda.api.audio.OpusPacket;
import net.dv8tion.jda.api.audio.opus.IOpusDecoder;
import net.dv8tion.jda.internal.audio.AudioPacket;
import org.jspecify.annotations.NullMarked;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.nio.ByteBuffer;
import java.nio.ShortBuffer;

import static java.lang.foreign.ValueLayout.JAVA_INT;

@NullMarked
class OpusDecoder implements IOpusDecoder {
    private static final Logger LOG = LoggerFactory.getLogger(OpusDecoder.class);

    private final MemorySegment peer;

    private boolean closed;

    private char lastSeq = (char) -1;

    public OpusDecoder() {
        try (Arena arena = Arena.ofConfined()) {
            MemorySegment errorSegment = arena.allocate(JAVA_INT);
            this.peer = Opus.opus_decoder_create(OpusPacket.OPUS_SAMPLE_RATE, OpusPacket.OPUS_CHANNEL_COUNT, errorSegment);

            int error = errorSegment.get(JAVA_INT, 0);
            if (error != Opus.OPUS_OK()) {
                throw new OpusException("Could not create decoder", error);
            }
        }
    }

    @Override
    public void close() {
        if (closed) return;

        closed = true;
        Opus.opus_decoder_destroy(peer);
    }

    @Override
    public boolean isInOrder(char newSeq) {
        return lastSeq == (char) -1 || newSeq > lastSeq || lastSeq - newSeq > 10;
    }

    @Override
    public short @Nullable [] decode(AudioPacket decryptedPacket) {
        if (closed) throw new IllegalStateException("Decoder is closed.");

        this.lastSeq = decryptedPacket.getSequence();

        ByteBuffer encodedAudio = decryptedPacket.getEncodedAudio();
        ShortBuffer decoded = ByteBuffer.allocateDirect(OpusPacket.OPUS_FRAME_SIZE * OpusPacket.OPUS_CHANNEL_COUNT * Short.BYTES).asShortBuffer();
        int result = Opus.opus_decode(
                peer,
                MemorySegment.ofBuffer(encodedAudio), encodedAudio.remaining(),
                MemorySegment.ofBuffer(decoded),
                OpusPacket.OPUS_FRAME_SIZE,
                0);
        if (result < 0) {
            LOG.error("Could not decode audio: {}", OpusException.getErrorString(result));
            return null;
        }

        short[] audio = new short[result * OpusPacket.OPUS_CHANNEL_COUNT];
        decoded.get(audio);
        return audio;
    }
}
