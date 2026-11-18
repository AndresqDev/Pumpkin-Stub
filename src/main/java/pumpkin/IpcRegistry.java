package pumpkin;

/** No-op inter-plugin communication facade. */
public class IpcRegistry {
    public byte[] sendIpcMessage(String recipient, byte[] message) {
        return new byte[0];
    }

    public void onMessage(IpcHandler handler) {
    }

    @FunctionalInterface
    public interface IpcHandler {
        byte[] handle(String sender, byte[] message);
    }
}
