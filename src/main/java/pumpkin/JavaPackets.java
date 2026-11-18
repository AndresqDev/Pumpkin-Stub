package pumpkin;

/** Java Edition packets that can be sent through a JavaPlayer. */
public final class JavaPackets {
    private JavaPackets() {
    }

    public static class ClientboundPacket {
    }

    /**
     * Custom payload / plugin message. This is the portable way to send
     * application-defined bytes over a Java channel.
     */
    public static final class CCustomPayload extends ClientboundPacket {
        public final String channel;
        public final byte[] data;

        public CCustomPayload(String channel, byte[] data) {
            this.channel = channel;
            this.data = data == null ? new byte[0] : data.clone();
        }
    }

    /** Disconnects a Java player with a message. */
    public static final class CPlayDisconnect extends ClientboundPacket {
        public final String reason;

        public CPlayDisconnect(String reason) {
            this.reason = reason;
        }
    }

    /** Keep-alive request. */
    public static final class CKeepAlive extends ClientboundPacket {
        public final long keepAliveId;

        public CKeepAlive(long keepAliveId) {
            this.keepAliveId = keepAliveId;
        }
    }

    /** Generic game event. */
    public static final class CGameEvent extends ClientboundPacket {
        public final int event;
        public final float value;

        public CGameEvent(int event, float value) {
            this.event = event;
            this.value = value;
        }
    }

    /** Transfers a Java player to another server. */
    public static final class CTransfer extends ClientboundPacket {
        public final String host;
        public final int port;

        public CTransfer(String host, int port) {
            this.host = host;
            this.port = port;
        }
    }
}
