package pumpkin;

import java.util.List;

/** No-op player facade. */
public class Player {
    public String getName() {
        return "";
    }

    public void sendMessage(TextComponent message) {
        sendSystemMessage(message, false);
    }

    public void sendMessage(String message) {
        sendSystemMessage(TextComponent.text(message), false);
    }

    public void send(String message) {
        sendSystemMessage(TextComponent.text(message), false);
    }

    public void openGui(Gui gui) {
    }

    public void sendSystemMessage(TextComponent message, boolean overlay) {
    }

    public void sendSystemMessage(TextComponent message) {
        sendSystemMessage(message, false);
    }

    public float getYaw() {
        return 0.0f;
    }

    public float getPitch() {
        return 0.0f;
    }

    public String getLocale() {
        return "en_us";
    }

    public int getPing() {
        return 0;
    }

    public int getPermissionLevel() {
        return 0;
    }

    public void setPermissionLevel(int level) {
    }

    public void setPermission(String node, boolean value) {
    }

    public void unsetPermission(String node) {
    }

    public boolean hasPermissionSet(String node) {
        return false;
    }

    public TextComponent getDisplayName() {
        return TextComponent.text(getName());
    }

    public void setDisplayName(TextComponent displayName) {
    }

    public TextComponent getTabListName() {
        return null;
    }

    public PlayerInventory getInventory() {
        return new PlayerInventory();
    }

    public JavaPlayer asJava() {
        return null;
    }

    public BedrockPlayer asBedrock() {
        return null;
    }

    public Common.GameMode getGamemode() {
        return Common.GameMode.SURVIVAL;
    }

    public void setGamemode(Common.GameMode mode) {
    }

    public Position getPosition() {
        return new Position(0.0, 0.0, 0.0);
    }

    public void teleport(Position position) {
    }

    public boolean hasPermission(String node) {
        return false;
    }

    public World getWorld() {
        return new World();
    }

    public float getHealth() {
        return 20.0f;
    }

    public void setHealth(float health) {
    }

    public void kick(TextComponent reason) {
    }

    public List<Player> getPassengers() {
        return List.of();
    }
}
