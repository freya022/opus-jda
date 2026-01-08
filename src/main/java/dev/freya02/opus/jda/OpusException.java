package dev.freya02.opus.jda;

import org.jspecify.annotations.NullMarked;

@NullMarked
public class OpusException extends RuntimeException {
    OpusException(String message, int code) {
        super(message + ": " + getErrorString(code));
    }

    static String getErrorString(int code) {
        try {
            return Opus.opus_strerror(code).getString(0);
        } catch (Exception e) {
            return "<native error>";
        }
    }
}
