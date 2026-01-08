package dev.freya02.opus.jda;

import net.dv8tion.jda.api.audio.opus.IOpusCodecFactory;
import net.dv8tion.jda.api.audio.opus.IOpusDecoder;
import net.dv8tion.jda.api.audio.opus.IOpusEncoder;
import org.jspecify.annotations.NullMarked;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;

@NullMarked
public class OpusCodecFactory implements IOpusCodecFactory {
    private static final Logger LOG = LoggerFactory.getLogger(OpusCodecFactory.class);

    public OpusCodecFactory() throws IOException {
        if (!OpusNativesLoader.isLoaded()) {
            NativeUtil.System system = NativeUtil.getSystem();
            String absoluteNativeResource = String.format("/dev/freya02/opus/jda/natives/%s/libopus.%s", system.platform, system.sharedLibraryExtension);
            OpusNativesLoader.loadFromJar(absoluteNativeResource, OpusCodecFactory.class);
        }

        LOG.debug("Using {}", Opus.opus_get_version_string().getString(0));
    }

    @Override
    public IOpusEncoder createEncoder() {
        return new OpusEncoder();
    }

    @Override
    public IOpusDecoder createDecoder() {
        return new OpusDecoder();
    }
}
