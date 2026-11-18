package pumpkin;

/** Java Edition-specific player handle. */
public class JavaPlayer {
    public void sendPacket(JavaPackets.ClientboundPacket packet) {
    }

    public String getBrand() {
        return "vanilla";
    }

    public int getVersion() {
        return 0;
    }

    public void showDialog(JavaDialogs.Dialog dialog) {
    }
}
