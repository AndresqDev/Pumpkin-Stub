package pumpkin;

/** Java-friendly GUI facade. */
public class Gui {
    private final Screens.Screen type;
    private final TextComponent title;
    private final Inventory inventory = new Inventory();

    public Gui(Screens.Screen type, TextComponent title) {
        this.type = type;
        this.title = title;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setItem(int slot, ItemStack item) {
    }

    public ItemStack getItem(int slot) {
        return null;
    }

    public Screens.Screen getType() {
        return type;
    }

    public TextComponent getTitle() {
        return title;
    }

    public int getSize() {
        return 0;
    }

    public void clearItems() {
    }

    public void setAllowGrabItems(boolean allow) {
    }

    public boolean getAllowGrabItems() {
        return true;
    }

    public void setAllowPutItems(boolean allow) {
    }

    public boolean getAllowPutItems() {
        return true;
    }
}
