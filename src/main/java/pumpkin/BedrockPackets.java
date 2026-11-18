package pumpkin;

/** Bedrock Edition packets that can be sent through a BedrockPlayer. */
public final class BedrockPackets {
    private BedrockPackets() {
    }

    public static class ClientboundPacket {
    }

    public static final class Unknown extends ClientboundPacket {
    }

    /** Disconnects a Bedrock player. */
    public static final class CDisconnect extends ClientboundPacket {
        public final int reason;
        public final boolean skipMessage;
        public final String message;
        public final String filteredMessage;

        public CDisconnect(int reason, boolean skipMessage, String message, String filteredMessage) {
            this.reason = reason;
            this.skipMessage = skipMessage;
            this.message = message;
            this.filteredMessage = filteredMessage;
        }
    }

    /** Sets the client's time of day. */
    public static final class CSetTime extends ClientboundPacket {
        public final int time;

        public CSetTime(int time) {
            this.time = time;
        }
    }

    /** Requests a Bedrock modal form. */
    public static final class CModalFormRequest extends ClientboundPacket {
        public final int formId;
        public final String formUiJson;

        public CModalFormRequest(int formId, String formUiJson) {
            this.formId = formId;
            this.formUiJson = formUiJson;
        }
    }
}
