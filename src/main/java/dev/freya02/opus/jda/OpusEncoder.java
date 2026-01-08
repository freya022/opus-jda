package dev.freya02.opus.jda;

import net.dv8tion.jda.api.audio.OpusPacket;
import net.dv8tion.jda.api.audio.opus.IOpusEncoder;
import org.jspecify.annotations.NullMarked;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.nio.ByteBuffer;

import static java.lang.foreign.ValueLayout.JAVA_INT;

@NullMarked
class OpusEncoder implements IOpusEncoder {
    private static final Logger LOG = LoggerFactory.getLogger(OpusEncoder.class);

    private final MemorySegment peer;

    private boolean closed;

    public OpusEncoder() {
        try (Arena arena = Arena.ofConfined()) {
            MemorySegment errorSegment = arena.allocate(JAVA_INT);
            this.peer = Opus.opus_encoder_create(OpusPacket.OPUS_SAMPLE_RATE, OpusPacket.OPUS_CHANNEL_COUNT, Opus.OPUS_APPLICATION_AUDIO(), errorSegment);

            int error = errorSegment.get(JAVA_INT, 0);
            if (error != Opus.OPUS_OK()) {
                throw new OpusException("Could not create encoder", error);
            }
        }
    }

    @Override
    public void close() {
        if (closed) return;

        closed = true;
        Opus.opus_encoder_destroy(peer);
    }

    @Override
    @Nullable
    public ByteBuffer encode(ByteBuffer rawAudio) {
        if (closed) throw new IllegalStateException("Encoder is closed");

        ByteBuffer encoded = ByteBuffer.allocateDirect(4096);
        int result = Opus.opus_encode(
                peer,
                MemorySegment.ofBuffer(rawAudio.asShortBuffer()),
                OpusPacket.OPUS_FRAME_SIZE,
                MemorySegment.ofBuffer(encoded), encoded.capacity());
        if (result < 0) {
            LOG.error("Received error code from opus_encode(...): {} ({})", result, OpusException.getErrorString(result));
            return null;
        }

        encoded.position(0).limit(result);
        return encoded;
    }
}
