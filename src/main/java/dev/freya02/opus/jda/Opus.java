package dev.freya02.opus.jda;

import java.lang.invoke.*;
import java.lang.foreign.*;

class Opus extends Opus$shared {

    private Opus() { }

    static final SymbolLookup SYMBOL_LOOKUP = SymbolLookup.loaderLookup()
            .or(Linker.nativeLinker().defaultLookup());

    private static final int OPUS_OK = (int)0L;
    /**
     * {@snippet lang=c :
     * #define OPUS_OK 0
     * }
     */
    public static int OPUS_OK() {
        return OPUS_OK;
    }
    private static final int OPUS_SET_APPLICATION_REQUEST = (int)4000L;
    /**
     * {@snippet lang=c :
     * #define OPUS_SET_APPLICATION_REQUEST 4000
     * }
     */
    public static int OPUS_SET_APPLICATION_REQUEST() {
        return OPUS_SET_APPLICATION_REQUEST;
    }
    private static final int OPUS_GET_APPLICATION_REQUEST = (int)4001L;
    /**
     * {@snippet lang=c :
     * #define OPUS_GET_APPLICATION_REQUEST 4001
     * }
     */
    public static int OPUS_GET_APPLICATION_REQUEST() {
        return OPUS_GET_APPLICATION_REQUEST;
    }
    private static final int OPUS_SET_BITRATE_REQUEST = (int)4002L;
    /**
     * {@snippet lang=c :
     * #define OPUS_SET_BITRATE_REQUEST 4002
     * }
     */
    public static int OPUS_SET_BITRATE_REQUEST() {
        return OPUS_SET_BITRATE_REQUEST;
    }
    private static final int OPUS_GET_BITRATE_REQUEST = (int)4003L;
    /**
     * {@snippet lang=c :
     * #define OPUS_GET_BITRATE_REQUEST 4003
     * }
     */
    public static int OPUS_GET_BITRATE_REQUEST() {
        return OPUS_GET_BITRATE_REQUEST;
    }
    private static final int OPUS_SET_MAX_BANDWIDTH_REQUEST = (int)4004L;
    /**
     * {@snippet lang=c :
     * #define OPUS_SET_MAX_BANDWIDTH_REQUEST 4004
     * }
     */
    public static int OPUS_SET_MAX_BANDWIDTH_REQUEST() {
        return OPUS_SET_MAX_BANDWIDTH_REQUEST;
    }
    private static final int OPUS_GET_MAX_BANDWIDTH_REQUEST = (int)4005L;
    /**
     * {@snippet lang=c :
     * #define OPUS_GET_MAX_BANDWIDTH_REQUEST 4005
     * }
     */
    public static int OPUS_GET_MAX_BANDWIDTH_REQUEST() {
        return OPUS_GET_MAX_BANDWIDTH_REQUEST;
    }
    private static final int OPUS_SET_VBR_REQUEST = (int)4006L;
    /**
     * {@snippet lang=c :
     * #define OPUS_SET_VBR_REQUEST 4006
     * }
     */
    public static int OPUS_SET_VBR_REQUEST() {
        return OPUS_SET_VBR_REQUEST;
    }
    private static final int OPUS_GET_VBR_REQUEST = (int)4007L;
    /**
     * {@snippet lang=c :
     * #define OPUS_GET_VBR_REQUEST 4007
     * }
     */
    public static int OPUS_GET_VBR_REQUEST() {
        return OPUS_GET_VBR_REQUEST;
    }
    private static final int OPUS_SET_BANDWIDTH_REQUEST = (int)4008L;
    /**
     * {@snippet lang=c :
     * #define OPUS_SET_BANDWIDTH_REQUEST 4008
     * }
     */
    public static int OPUS_SET_BANDWIDTH_REQUEST() {
        return OPUS_SET_BANDWIDTH_REQUEST;
    }
    private static final int OPUS_GET_BANDWIDTH_REQUEST = (int)4009L;
    /**
     * {@snippet lang=c :
     * #define OPUS_GET_BANDWIDTH_REQUEST 4009
     * }
     */
    public static int OPUS_GET_BANDWIDTH_REQUEST() {
        return OPUS_GET_BANDWIDTH_REQUEST;
    }
    private static final int OPUS_SET_COMPLEXITY_REQUEST = (int)4010L;
    /**
     * {@snippet lang=c :
     * #define OPUS_SET_COMPLEXITY_REQUEST 4010
     * }
     */
    public static int OPUS_SET_COMPLEXITY_REQUEST() {
        return OPUS_SET_COMPLEXITY_REQUEST;
    }
    private static final int OPUS_GET_COMPLEXITY_REQUEST = (int)4011L;
    /**
     * {@snippet lang=c :
     * #define OPUS_GET_COMPLEXITY_REQUEST 4011
     * }
     */
    public static int OPUS_GET_COMPLEXITY_REQUEST() {
        return OPUS_GET_COMPLEXITY_REQUEST;
    }
    private static final int OPUS_SET_INBAND_FEC_REQUEST = (int)4012L;
    /**
     * {@snippet lang=c :
     * #define OPUS_SET_INBAND_FEC_REQUEST 4012
     * }
     */
    public static int OPUS_SET_INBAND_FEC_REQUEST() {
        return OPUS_SET_INBAND_FEC_REQUEST;
    }
    private static final int OPUS_GET_INBAND_FEC_REQUEST = (int)4013L;
    /**
     * {@snippet lang=c :
     * #define OPUS_GET_INBAND_FEC_REQUEST 4013
     * }
     */
    public static int OPUS_GET_INBAND_FEC_REQUEST() {
        return OPUS_GET_INBAND_FEC_REQUEST;
    }
    private static final int OPUS_SET_PACKET_LOSS_PERC_REQUEST = (int)4014L;
    /**
     * {@snippet lang=c :
     * #define OPUS_SET_PACKET_LOSS_PERC_REQUEST 4014
     * }
     */
    public static int OPUS_SET_PACKET_LOSS_PERC_REQUEST() {
        return OPUS_SET_PACKET_LOSS_PERC_REQUEST;
    }
    private static final int OPUS_GET_PACKET_LOSS_PERC_REQUEST = (int)4015L;
    /**
     * {@snippet lang=c :
     * #define OPUS_GET_PACKET_LOSS_PERC_REQUEST 4015
     * }
     */
    public static int OPUS_GET_PACKET_LOSS_PERC_REQUEST() {
        return OPUS_GET_PACKET_LOSS_PERC_REQUEST;
    }
    private static final int OPUS_SET_DTX_REQUEST = (int)4016L;
    /**
     * {@snippet lang=c :
     * #define OPUS_SET_DTX_REQUEST 4016
     * }
     */
    public static int OPUS_SET_DTX_REQUEST() {
        return OPUS_SET_DTX_REQUEST;
    }
    private static final int OPUS_GET_DTX_REQUEST = (int)4017L;
    /**
     * {@snippet lang=c :
     * #define OPUS_GET_DTX_REQUEST 4017
     * }
     */
    public static int OPUS_GET_DTX_REQUEST() {
        return OPUS_GET_DTX_REQUEST;
    }
    private static final int OPUS_SET_VBR_CONSTRAINT_REQUEST = (int)4020L;
    /**
     * {@snippet lang=c :
     * #define OPUS_SET_VBR_CONSTRAINT_REQUEST 4020
     * }
     */
    public static int OPUS_SET_VBR_CONSTRAINT_REQUEST() {
        return OPUS_SET_VBR_CONSTRAINT_REQUEST;
    }
    private static final int OPUS_GET_VBR_CONSTRAINT_REQUEST = (int)4021L;
    /**
     * {@snippet lang=c :
     * #define OPUS_GET_VBR_CONSTRAINT_REQUEST 4021
     * }
     */
    public static int OPUS_GET_VBR_CONSTRAINT_REQUEST() {
        return OPUS_GET_VBR_CONSTRAINT_REQUEST;
    }
    private static final int OPUS_SET_FORCE_CHANNELS_REQUEST = (int)4022L;
    /**
     * {@snippet lang=c :
     * #define OPUS_SET_FORCE_CHANNELS_REQUEST 4022
     * }
     */
    public static int OPUS_SET_FORCE_CHANNELS_REQUEST() {
        return OPUS_SET_FORCE_CHANNELS_REQUEST;
    }
    private static final int OPUS_GET_FORCE_CHANNELS_REQUEST = (int)4023L;
    /**
     * {@snippet lang=c :
     * #define OPUS_GET_FORCE_CHANNELS_REQUEST 4023
     * }
     */
    public static int OPUS_GET_FORCE_CHANNELS_REQUEST() {
        return OPUS_GET_FORCE_CHANNELS_REQUEST;
    }
    private static final int OPUS_SET_SIGNAL_REQUEST = (int)4024L;
    /**
     * {@snippet lang=c :
     * #define OPUS_SET_SIGNAL_REQUEST 4024
     * }
     */
    public static int OPUS_SET_SIGNAL_REQUEST() {
        return OPUS_SET_SIGNAL_REQUEST;
    }
    private static final int OPUS_GET_SIGNAL_REQUEST = (int)4025L;
    /**
     * {@snippet lang=c :
     * #define OPUS_GET_SIGNAL_REQUEST 4025
     * }
     */
    public static int OPUS_GET_SIGNAL_REQUEST() {
        return OPUS_GET_SIGNAL_REQUEST;
    }
    private static final int OPUS_GET_LOOKAHEAD_REQUEST = (int)4027L;
    /**
     * {@snippet lang=c :
     * #define OPUS_GET_LOOKAHEAD_REQUEST 4027
     * }
     */
    public static int OPUS_GET_LOOKAHEAD_REQUEST() {
        return OPUS_GET_LOOKAHEAD_REQUEST;
    }
    private static final int OPUS_GET_SAMPLE_RATE_REQUEST = (int)4029L;
    /**
     * {@snippet lang=c :
     * #define OPUS_GET_SAMPLE_RATE_REQUEST 4029
     * }
     */
    public static int OPUS_GET_SAMPLE_RATE_REQUEST() {
        return OPUS_GET_SAMPLE_RATE_REQUEST;
    }
    private static final int OPUS_GET_FINAL_RANGE_REQUEST = (int)4031L;
    /**
     * {@snippet lang=c :
     * #define OPUS_GET_FINAL_RANGE_REQUEST 4031
     * }
     */
    public static int OPUS_GET_FINAL_RANGE_REQUEST() {
        return OPUS_GET_FINAL_RANGE_REQUEST;
    }
    private static final int OPUS_GET_PITCH_REQUEST = (int)4033L;
    /**
     * {@snippet lang=c :
     * #define OPUS_GET_PITCH_REQUEST 4033
     * }
     */
    public static int OPUS_GET_PITCH_REQUEST() {
        return OPUS_GET_PITCH_REQUEST;
    }
    private static final int OPUS_SET_GAIN_REQUEST = (int)4034L;
    /**
     * {@snippet lang=c :
     * #define OPUS_SET_GAIN_REQUEST 4034
     * }
     */
    public static int OPUS_SET_GAIN_REQUEST() {
        return OPUS_SET_GAIN_REQUEST;
    }
    private static final int OPUS_GET_GAIN_REQUEST = (int)4045L;
    /**
     * {@snippet lang=c :
     * #define OPUS_GET_GAIN_REQUEST 4045
     * }
     */
    public static int OPUS_GET_GAIN_REQUEST() {
        return OPUS_GET_GAIN_REQUEST;
    }
    private static final int OPUS_SET_LSB_DEPTH_REQUEST = (int)4036L;
    /**
     * {@snippet lang=c :
     * #define OPUS_SET_LSB_DEPTH_REQUEST 4036
     * }
     */
    public static int OPUS_SET_LSB_DEPTH_REQUEST() {
        return OPUS_SET_LSB_DEPTH_REQUEST;
    }
    private static final int OPUS_GET_LSB_DEPTH_REQUEST = (int)4037L;
    /**
     * {@snippet lang=c :
     * #define OPUS_GET_LSB_DEPTH_REQUEST 4037
     * }
     */
    public static int OPUS_GET_LSB_DEPTH_REQUEST() {
        return OPUS_GET_LSB_DEPTH_REQUEST;
    }
    private static final int OPUS_GET_LAST_PACKET_DURATION_REQUEST = (int)4039L;
    /**
     * {@snippet lang=c :
     * #define OPUS_GET_LAST_PACKET_DURATION_REQUEST 4039
     * }
     */
    public static int OPUS_GET_LAST_PACKET_DURATION_REQUEST() {
        return OPUS_GET_LAST_PACKET_DURATION_REQUEST;
    }
    private static final int OPUS_SET_EXPERT_FRAME_DURATION_REQUEST = (int)4040L;
    /**
     * {@snippet lang=c :
     * #define OPUS_SET_EXPERT_FRAME_DURATION_REQUEST 4040
     * }
     */
    public static int OPUS_SET_EXPERT_FRAME_DURATION_REQUEST() {
        return OPUS_SET_EXPERT_FRAME_DURATION_REQUEST;
    }
    private static final int OPUS_GET_EXPERT_FRAME_DURATION_REQUEST = (int)4041L;
    /**
     * {@snippet lang=c :
     * #define OPUS_GET_EXPERT_FRAME_DURATION_REQUEST 4041
     * }
     */
    public static int OPUS_GET_EXPERT_FRAME_DURATION_REQUEST() {
        return OPUS_GET_EXPERT_FRAME_DURATION_REQUEST;
    }
    private static final int OPUS_SET_PREDICTION_DISABLED_REQUEST = (int)4042L;
    /**
     * {@snippet lang=c :
     * #define OPUS_SET_PREDICTION_DISABLED_REQUEST 4042
     * }
     */
    public static int OPUS_SET_PREDICTION_DISABLED_REQUEST() {
        return OPUS_SET_PREDICTION_DISABLED_REQUEST;
    }
    private static final int OPUS_GET_PREDICTION_DISABLED_REQUEST = (int)4043L;
    /**
     * {@snippet lang=c :
     * #define OPUS_GET_PREDICTION_DISABLED_REQUEST 4043
     * }
     */
    public static int OPUS_GET_PREDICTION_DISABLED_REQUEST() {
        return OPUS_GET_PREDICTION_DISABLED_REQUEST;
    }
    private static final int OPUS_SET_PHASE_INVERSION_DISABLED_REQUEST = (int)4046L;
    /**
     * {@snippet lang=c :
     * #define OPUS_SET_PHASE_INVERSION_DISABLED_REQUEST 4046
     * }
     */
    public static int OPUS_SET_PHASE_INVERSION_DISABLED_REQUEST() {
        return OPUS_SET_PHASE_INVERSION_DISABLED_REQUEST;
    }
    private static final int OPUS_GET_PHASE_INVERSION_DISABLED_REQUEST = (int)4047L;
    /**
     * {@snippet lang=c :
     * #define OPUS_GET_PHASE_INVERSION_DISABLED_REQUEST 4047
     * }
     */
    public static int OPUS_GET_PHASE_INVERSION_DISABLED_REQUEST() {
        return OPUS_GET_PHASE_INVERSION_DISABLED_REQUEST;
    }
    private static final int OPUS_GET_IN_DTX_REQUEST = (int)4049L;
    /**
     * {@snippet lang=c :
     * #define OPUS_GET_IN_DTX_REQUEST 4049
     * }
     */
    public static int OPUS_GET_IN_DTX_REQUEST() {
        return OPUS_GET_IN_DTX_REQUEST;
    }
    private static final int OPUS_SET_DRED_DURATION_REQUEST = (int)4050L;
    private static final int OPUS_GET_DRED_DURATION_REQUEST = (int)4051L;
    private static final int OPUS_SET_DNN_BLOB_REQUEST = (int)4052L;
    /**
     * {@snippet lang=c :
     * #define OPUS_SET_DNN_BLOB_REQUEST 4052
     * }
     */
    public static int OPUS_SET_DNN_BLOB_REQUEST() {
        return OPUS_SET_DNN_BLOB_REQUEST;
    }
    private static final int OPUS_SET_OSCE_BWE_REQUEST = (int)4054L;
    /**
     * {@snippet lang=c :
     * #define OPUS_SET_OSCE_BWE_REQUEST 4054
     * }
     */
    public static int OPUS_SET_OSCE_BWE_REQUEST() {
        return OPUS_SET_OSCE_BWE_REQUEST;
    }
    private static final int OPUS_GET_OSCE_BWE_REQUEST = (int)4055L;
    /**
     * {@snippet lang=c :
     * #define OPUS_GET_OSCE_BWE_REQUEST 4055
     * }
     */
    public static int OPUS_GET_OSCE_BWE_REQUEST() {
        return OPUS_GET_OSCE_BWE_REQUEST;
    }
    private static final int OPUS_SET_QEXT_REQUEST = (int)4056L;
    /**
     * {@snippet lang=c :
     * #define OPUS_SET_QEXT_REQUEST 4056
     * }
     */
    public static int OPUS_SET_QEXT_REQUEST() {
        return OPUS_SET_QEXT_REQUEST;
    }
    private static final int OPUS_GET_QEXT_REQUEST = (int)4057L;
    /**
     * {@snippet lang=c :
     * #define OPUS_GET_QEXT_REQUEST 4057
     * }
     */
    public static int OPUS_GET_QEXT_REQUEST() {
        return OPUS_GET_QEXT_REQUEST;
    }
    private static final int OPUS_SET_IGNORE_EXTENSIONS_REQUEST = (int)4058L;
    /**
     * {@snippet lang=c :
     * #define OPUS_SET_IGNORE_EXTENSIONS_REQUEST 4058
     * }
     */
    public static int OPUS_SET_IGNORE_EXTENSIONS_REQUEST() {
        return OPUS_SET_IGNORE_EXTENSIONS_REQUEST;
    }
    private static final int OPUS_GET_IGNORE_EXTENSIONS_REQUEST = (int)4059L;
    /**
     * {@snippet lang=c :
     * #define OPUS_GET_IGNORE_EXTENSIONS_REQUEST 4059
     * }
     */
    public static int OPUS_GET_IGNORE_EXTENSIONS_REQUEST() {
        return OPUS_GET_IGNORE_EXTENSIONS_REQUEST;
    }
    private static final int OPUS_APPLICATION_VOIP = (int)2048L;
    /**
     * {@snippet lang=c :
     * #define OPUS_APPLICATION_VOIP 2048
     * }
     */
    public static int OPUS_APPLICATION_VOIP() {
        return OPUS_APPLICATION_VOIP;
    }
    private static final int OPUS_APPLICATION_AUDIO = (int)2049L;
    /**
     * {@snippet lang=c :
     * #define OPUS_APPLICATION_AUDIO 2049
     * }
     */
    public static int OPUS_APPLICATION_AUDIO() {
        return OPUS_APPLICATION_AUDIO;
    }
    private static final int OPUS_APPLICATION_RESTRICTED_LOWDELAY = (int)2051L;
    /**
     * {@snippet lang=c :
     * #define OPUS_APPLICATION_RESTRICTED_LOWDELAY 2051
     * }
     */
    public static int OPUS_APPLICATION_RESTRICTED_LOWDELAY() {
        return OPUS_APPLICATION_RESTRICTED_LOWDELAY;
    }
    private static final int OPUS_APPLICATION_RESTRICTED_SILK = (int)2052L;
    /**
     * {@snippet lang=c :
     * #define OPUS_APPLICATION_RESTRICTED_SILK 2052
     * }
     */
    public static int OPUS_APPLICATION_RESTRICTED_SILK() {
        return OPUS_APPLICATION_RESTRICTED_SILK;
    }
    private static final int OPUS_APPLICATION_RESTRICTED_CELT = (int)2053L;
    /**
     * {@snippet lang=c :
     * #define OPUS_APPLICATION_RESTRICTED_CELT 2053
     * }
     */
    public static int OPUS_APPLICATION_RESTRICTED_CELT() {
        return OPUS_APPLICATION_RESTRICTED_CELT;
    }
    private static final int OPUS_SIGNAL_VOICE = (int)3001L;
    /**
     * {@snippet lang=c :
     * #define OPUS_SIGNAL_VOICE 3001
     * }
     */
    public static int OPUS_SIGNAL_VOICE() {
        return OPUS_SIGNAL_VOICE;
    }
    private static final int OPUS_SIGNAL_MUSIC = (int)3002L;
    /**
     * {@snippet lang=c :
     * #define OPUS_SIGNAL_MUSIC 3002
     * }
     */
    public static int OPUS_SIGNAL_MUSIC() {
        return OPUS_SIGNAL_MUSIC;
    }
    private static final int OPUS_BANDWIDTH_NARROWBAND = (int)1101L;
    /**
     * {@snippet lang=c :
     * #define OPUS_BANDWIDTH_NARROWBAND 1101
     * }
     */
    public static int OPUS_BANDWIDTH_NARROWBAND() {
        return OPUS_BANDWIDTH_NARROWBAND;
    }
    private static final int OPUS_BANDWIDTH_MEDIUMBAND = (int)1102L;
    /**
     * {@snippet lang=c :
     * #define OPUS_BANDWIDTH_MEDIUMBAND 1102
     * }
     */
    public static int OPUS_BANDWIDTH_MEDIUMBAND() {
        return OPUS_BANDWIDTH_MEDIUMBAND;
    }
    private static final int OPUS_BANDWIDTH_WIDEBAND = (int)1103L;
    /**
     * {@snippet lang=c :
     * #define OPUS_BANDWIDTH_WIDEBAND 1103
     * }
     */
    public static int OPUS_BANDWIDTH_WIDEBAND() {
        return OPUS_BANDWIDTH_WIDEBAND;
    }
    private static final int OPUS_BANDWIDTH_SUPERWIDEBAND = (int)1104L;
    /**
     * {@snippet lang=c :
     * #define OPUS_BANDWIDTH_SUPERWIDEBAND 1104
     * }
     */
    public static int OPUS_BANDWIDTH_SUPERWIDEBAND() {
        return OPUS_BANDWIDTH_SUPERWIDEBAND;
    }
    private static final int OPUS_BANDWIDTH_FULLBAND = (int)1105L;
    /**
     * {@snippet lang=c :
     * #define OPUS_BANDWIDTH_FULLBAND 1105
     * }
     */
    public static int OPUS_BANDWIDTH_FULLBAND() {
        return OPUS_BANDWIDTH_FULLBAND;
    }
    private static final int OPUS_FRAMESIZE_ARG = (int)5000L;
    /**
     * {@snippet lang=c :
     * #define OPUS_FRAMESIZE_ARG 5000
     * }
     */
    public static int OPUS_FRAMESIZE_ARG() {
        return OPUS_FRAMESIZE_ARG;
    }
    private static final int OPUS_FRAMESIZE_2_5_MS = (int)5001L;
    /**
     * {@snippet lang=c :
     * #define OPUS_FRAMESIZE_2_5_MS 5001
     * }
     */
    public static int OPUS_FRAMESIZE_2_5_MS() {
        return OPUS_FRAMESIZE_2_5_MS;
    }
    private static final int OPUS_FRAMESIZE_5_MS = (int)5002L;
    /**
     * {@snippet lang=c :
     * #define OPUS_FRAMESIZE_5_MS 5002
     * }
     */
    public static int OPUS_FRAMESIZE_5_MS() {
        return OPUS_FRAMESIZE_5_MS;
    }
    private static final int OPUS_FRAMESIZE_10_MS = (int)5003L;
    /**
     * {@snippet lang=c :
     * #define OPUS_FRAMESIZE_10_MS 5003
     * }
     */
    public static int OPUS_FRAMESIZE_10_MS() {
        return OPUS_FRAMESIZE_10_MS;
    }
    private static final int OPUS_FRAMESIZE_20_MS = (int)5004L;
    /**
     * {@snippet lang=c :
     * #define OPUS_FRAMESIZE_20_MS 5004
     * }
     */
    public static int OPUS_FRAMESIZE_20_MS() {
        return OPUS_FRAMESIZE_20_MS;
    }
    private static final int OPUS_FRAMESIZE_40_MS = (int)5005L;
    /**
     * {@snippet lang=c :
     * #define OPUS_FRAMESIZE_40_MS 5005
     * }
     */
    public static int OPUS_FRAMESIZE_40_MS() {
        return OPUS_FRAMESIZE_40_MS;
    }
    private static final int OPUS_FRAMESIZE_60_MS = (int)5006L;
    /**
     * {@snippet lang=c :
     * #define OPUS_FRAMESIZE_60_MS 5006
     * }
     */
    public static int OPUS_FRAMESIZE_60_MS() {
        return OPUS_FRAMESIZE_60_MS;
    }
    private static final int OPUS_FRAMESIZE_80_MS = (int)5007L;
    /**
     * {@snippet lang=c :
     * #define OPUS_FRAMESIZE_80_MS 5007
     * }
     */
    public static int OPUS_FRAMESIZE_80_MS() {
        return OPUS_FRAMESIZE_80_MS;
    }
    private static final int OPUS_FRAMESIZE_100_MS = (int)5008L;
    /**
     * {@snippet lang=c :
     * #define OPUS_FRAMESIZE_100_MS 5008
     * }
     */
    public static int OPUS_FRAMESIZE_100_MS() {
        return OPUS_FRAMESIZE_100_MS;
    }
    private static final int OPUS_FRAMESIZE_120_MS = (int)5009L;
    /**
     * {@snippet lang=c :
     * #define OPUS_FRAMESIZE_120_MS 5009
     * }
     */
    public static int OPUS_FRAMESIZE_120_MS() {
        return OPUS_FRAMESIZE_120_MS;
    }
    private static final int OPUS_RESET_STATE = (int)4028L;
    /**
     * {@snippet lang=c :
     * #define OPUS_RESET_STATE 4028
     * }
     */
    public static int OPUS_RESET_STATE() {
        return OPUS_RESET_STATE;
    }

    private static class opus_strerror {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of(
            Opus.C_POINTER,
            Opus.C_INT
        );

        public static final MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("opus_strerror");

        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
    }

    /**
     * {@snippet lang=c :
     * const char *opus_strerror(int error)
     * }
     */
    public static MemorySegment opus_strerror(int error) {
        var mh$ = opus_strerror.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                traceDowncall("opus_strerror", error);
            }
            return (MemorySegment)mh$.invokeExact(error);
        } catch (Error | RuntimeException ex) {
           throw ex;
        } catch (Throwable ex$) {
           throw new AssertionError("should not reach here", ex$);
        }
    }

    private static class opus_get_version_string {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of(
            Opus.C_POINTER    );

        public static final MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("opus_get_version_string");

        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
    }

    /**
     * {@snippet lang=c :
     * const char *opus_get_version_string()
     * }
     */
    public static MemorySegment opus_get_version_string() {
        var mh$ = opus_get_version_string.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                traceDowncall("opus_get_version_string");
            }
            return (MemorySegment)mh$.invokeExact();
        } catch (Error | RuntimeException ex) {
           throw ex;
        } catch (Throwable ex$) {
           throw new AssertionError("should not reach here", ex$);
        }
    }

    private static class opus_encoder_create {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of(
            Opus.C_POINTER,
            Opus.C_INT,
            Opus.C_INT,
            Opus.C_INT,
            Opus.C_POINTER
        );

        public static final MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("opus_encoder_create");

        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
    }

    /**
     * {@snippet lang=c :
     * OpusEncoder *opus_encoder_create(opus_int32 Fs, int channels, int application, int *error)
     * }
     */
    public static MemorySegment opus_encoder_create(int Fs, int channels, int application, MemorySegment error) {
        var mh$ = opus_encoder_create.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                traceDowncall("opus_encoder_create", Fs, channels, application, error);
            }
            return (MemorySegment)mh$.invokeExact(Fs, channels, application, error);
        } catch (Error | RuntimeException ex) {
           throw ex;
        } catch (Throwable ex$) {
           throw new AssertionError("should not reach here", ex$);
        }
    }

    private static class opus_encode {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of(
            Opus.C_INT,
            Opus.C_POINTER,
            Opus.C_POINTER,
            Opus.C_INT,
            Opus.C_POINTER,
            Opus.C_INT
        );

        public static final MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("opus_encode");

        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, Linker.Option.critical(true));
    }

    /**
     * {@snippet lang=c :
     * opus_int32 opus_encode(OpusEncoder *st, const opus_int16 *pcm, int frame_size, unsigned char *data, opus_int32 max_data_bytes)
     * }
     */
    public static int opus_encode(MemorySegment st, MemorySegment pcm, int frame_size, MemorySegment data, int max_data_bytes) {
        var mh$ = opus_encode.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                traceDowncall("opus_encode", st, pcm, frame_size, data, max_data_bytes);
            }
            return (int)mh$.invokeExact(st, pcm, frame_size, data, max_data_bytes);
        } catch (Error | RuntimeException ex) {
           throw ex;
        } catch (Throwable ex$) {
           throw new AssertionError("should not reach here", ex$);
        }
    }

    private static class opus_encoder_destroy {
        public static final FunctionDescriptor DESC = FunctionDescriptor.ofVoid(
            Opus.C_POINTER
        );

        public static final MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("opus_encoder_destroy");

        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
    }

    /**
     * {@snippet lang=c :
     * void opus_encoder_destroy(OpusEncoder *st)
     * }
     */
    public static void opus_encoder_destroy(MemorySegment st) {
        var mh$ = opus_encoder_destroy.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                traceDowncall("opus_encoder_destroy", st);
            }
            mh$.invokeExact(st);
        } catch (Error | RuntimeException ex) {
           throw ex;
        } catch (Throwable ex$) {
           throw new AssertionError("should not reach here", ex$);
        }
    }

    /**
     * Variadic invoker class for:
     * {@snippet lang=c :
     * int opus_encoder_ctl(OpusEncoder *st, int request, ...)
     * }
     */
    public static class opus_encoder_ctl {
        private static final FunctionDescriptor BASE_DESC = FunctionDescriptor.of(
                Opus.C_INT,
                Opus.C_POINTER,
                Opus.C_INT
            );
        private static final MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("opus_encoder_ctl");

        private final MethodHandle handle;
        private final FunctionDescriptor descriptor;
        private final MethodHandle spreader;

        private opus_encoder_ctl(MethodHandle handle, FunctionDescriptor descriptor, MethodHandle spreader) {
            this.handle = handle;
            this.descriptor = descriptor;
            this.spreader = spreader;
        }

        /**
         * Variadic invoker factory for:
         * {@snippet lang=c :
         * int opus_encoder_ctl(OpusEncoder *st, int request, ...)
         * }
         */
        public static opus_encoder_ctl makeInvoker(MemoryLayout... layouts) {
            FunctionDescriptor desc$ = BASE_DESC.appendArgumentLayouts(layouts);
            Linker.Option fva$ = Linker.Option.firstVariadicArg(BASE_DESC.argumentLayouts().size());
            var mh$ = Linker.nativeLinker().downcallHandle(ADDR, desc$, fva$);
            var spreader$ = mh$.asSpreader(Object[].class, layouts.length);
            return new opus_encoder_ctl(mh$, desc$, spreader$);
        }

        /**
         * {@return the address}
         */
        public static MemorySegment address() {
            return ADDR;
        }

        /**
         * {@return the specialized method handle}
         */
        public MethodHandle handle() {
            return handle;
        }

        /**
         * {@return the specialized descriptor}
         */
        public FunctionDescriptor descriptor() {
            return descriptor;
        }

        public int apply(MemorySegment st, int request, Object... x2) {
            try {
                if (TRACE_DOWNCALLS) {
                    traceDowncall("opus_encoder_ctl", st, request, x2);
                }
                return (int) spreader.invokeExact(st, request, x2);
            } catch(IllegalArgumentException | ClassCastException ex$)  {
                throw ex$; // rethrow IAE from passing wrong number/type of args
            } catch (Throwable ex$) {
               throw new AssertionError("should not reach here", ex$);
            }
        }
    }

    private static class opus_decoder_create {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of(
            Opus.C_POINTER,
            Opus.C_INT,
            Opus.C_INT,
            Opus.C_POINTER
        );

        public static final MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("opus_decoder_create");

        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
    }

    /**
     * {@snippet lang=c :
     * OpusDecoder *opus_decoder_create(opus_int32 Fs, int channels, int *error)
     * }
     */
    public static MemorySegment opus_decoder_create(int Fs, int channels, MemorySegment error) {
        var mh$ = opus_decoder_create.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                traceDowncall("opus_decoder_create", Fs, channels, error);
            }
            return (MemorySegment)mh$.invokeExact(Fs, channels, error);
        } catch (Error | RuntimeException ex) {
           throw ex;
        } catch (Throwable ex$) {
           throw new AssertionError("should not reach here", ex$);
        }
    }

    private static class opus_decode {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of(
            Opus.C_INT,
            Opus.C_POINTER,
            Opus.C_POINTER,
            Opus.C_INT,
            Opus.C_POINTER,
            Opus.C_INT,
            Opus.C_INT
        );

        public static final MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("opus_decode");

        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, Linker.Option.critical(true));
    }

    /**
     * {@snippet lang=c :
     * int opus_decode(OpusDecoder *st, const unsigned char *data, opus_int32 len, opus_int16 *pcm, int frame_size, int decode_fec)
     * }
     */
    public static int opus_decode(MemorySegment st, MemorySegment data, int len, MemorySegment pcm, int frame_size, int decode_fec) {
        var mh$ = opus_decode.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                traceDowncall("opus_decode", st, data, len, pcm, frame_size, decode_fec);
            }
            return (int)mh$.invokeExact(st, data, len, pcm, frame_size, decode_fec);
        } catch (Error | RuntimeException ex) {
           throw ex;
        } catch (Throwable ex$) {
           throw new AssertionError("should not reach here", ex$);
        }
    }

    /**
     * Variadic invoker class for:
     * {@snippet lang=c :
     * int opus_decoder_ctl(OpusDecoder *st, int request, ...)
     * }
     */
    public static class opus_decoder_ctl {
        private static final FunctionDescriptor BASE_DESC = FunctionDescriptor.of(
                Opus.C_INT,
                Opus.C_POINTER,
                Opus.C_INT
            );
        private static final MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("opus_decoder_ctl");

        private final MethodHandle handle;
        private final FunctionDescriptor descriptor;
        private final MethodHandle spreader;

        private opus_decoder_ctl(MethodHandle handle, FunctionDescriptor descriptor, MethodHandle spreader) {
            this.handle = handle;
            this.descriptor = descriptor;
            this.spreader = spreader;
        }

        /**
         * Variadic invoker factory for:
         * {@snippet lang=c :
         * int opus_decoder_ctl(OpusDecoder *st, int request, ...)
         * }
         */
        public static opus_decoder_ctl makeInvoker(MemoryLayout... layouts) {
            FunctionDescriptor desc$ = BASE_DESC.appendArgumentLayouts(layouts);
            Linker.Option fva$ = Linker.Option.firstVariadicArg(BASE_DESC.argumentLayouts().size());
            var mh$ = Linker.nativeLinker().downcallHandle(ADDR, desc$, fva$);
            var spreader$ = mh$.asSpreader(Object[].class, layouts.length);
            return new opus_decoder_ctl(mh$, desc$, spreader$);
        }

        /**
         * {@return the address}
         */
        public static MemorySegment address() {
            return ADDR;
        }

        /**
         * {@return the specialized method handle}
         */
        public MethodHandle handle() {
            return handle;
        }

        /**
         * {@return the specialized descriptor}
         */
        public FunctionDescriptor descriptor() {
            return descriptor;
        }

        public int apply(MemorySegment st, int request, Object... x2) {
            try {
                if (TRACE_DOWNCALLS) {
                    traceDowncall("opus_decoder_ctl", st, request, x2);
                }
                return (int) spreader.invokeExact(st, request, x2);
            } catch(IllegalArgumentException | ClassCastException ex$)  {
                throw ex$; // rethrow IAE from passing wrong number/type of args
            } catch (Throwable ex$) {
               throw new AssertionError("should not reach here", ex$);
            }
        }
    }

    private static class opus_decoder_destroy {
        public static final FunctionDescriptor DESC = FunctionDescriptor.ofVoid(
            Opus.C_POINTER
        );

        public static final MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("opus_decoder_destroy");

        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
    }

    /**
     * {@snippet lang=c :
     * void opus_decoder_destroy(OpusDecoder *st)
     * }
     */
    public static void opus_decoder_destroy(MemorySegment st) {
        var mh$ = opus_decoder_destroy.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                traceDowncall("opus_decoder_destroy", st);
            }
            mh$.invokeExact(st);
        } catch (Error | RuntimeException ex) {
           throw ex;
        } catch (Throwable ex$) {
           throw new AssertionError("should not reach here", ex$);
        }
    }

    private static final int OPUS_BAD_ARG = (int)-1L;
    /**
     * {@snippet lang=c :
     * #define OPUS_BAD_ARG -1
     * }
     */
    public static int OPUS_BAD_ARG() {
        return OPUS_BAD_ARG;
    }
    private static final int OPUS_BUFFER_TOO_SMALL = (int)-2L;
    /**
     * {@snippet lang=c :
     * #define OPUS_BUFFER_TOO_SMALL -2
     * }
     */
    public static int OPUS_BUFFER_TOO_SMALL() {
        return OPUS_BUFFER_TOO_SMALL;
    }
    private static final int OPUS_INTERNAL_ERROR = (int)-3L;
    /**
     * {@snippet lang=c :
     * #define OPUS_INTERNAL_ERROR -3
     * }
     */
    public static int OPUS_INTERNAL_ERROR() {
        return OPUS_INTERNAL_ERROR;
    }
    private static final int OPUS_INVALID_PACKET = (int)-4L;
    /**
     * {@snippet lang=c :
     * #define OPUS_INVALID_PACKET -4
     * }
     */
    public static int OPUS_INVALID_PACKET() {
        return OPUS_INVALID_PACKET;
    }
    private static final int OPUS_UNIMPLEMENTED = (int)-5L;
    /**
     * {@snippet lang=c :
     * #define OPUS_UNIMPLEMENTED -5
     * }
     */
    public static int OPUS_UNIMPLEMENTED() {
        return OPUS_UNIMPLEMENTED;
    }
    private static final int OPUS_INVALID_STATE = (int)-6L;
    /**
     * {@snippet lang=c :
     * #define OPUS_INVALID_STATE -6
     * }
     */
    public static int OPUS_INVALID_STATE() {
        return OPUS_INVALID_STATE;
    }
    private static final int OPUS_ALLOC_FAIL = (int)-7L;
    /**
     * {@snippet lang=c :
     * #define OPUS_ALLOC_FAIL -7
     * }
     */
    public static int OPUS_ALLOC_FAIL() {
        return OPUS_ALLOC_FAIL;
    }
    private static final int OPUS_AUTO = (int)-1000L;
    /**
     * {@snippet lang=c :
     * #define OPUS_AUTO -1000
     * }
     */
    public static int OPUS_AUTO() {
        return OPUS_AUTO;
    }
    private static final int OPUS_BITRATE_MAX = (int)-1L;
    /**
     * {@snippet lang=c :
     * #define OPUS_BITRATE_MAX -1
     * }
     */
    public static int OPUS_BITRATE_MAX() {
        return OPUS_BITRATE_MAX;
    }
}
