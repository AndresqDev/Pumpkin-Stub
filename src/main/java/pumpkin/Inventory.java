package pumpkin;

/** Minimal inventory facade. */
public class Inventory {
    public ItemStack getItem(int slot) {
        return null;
    }

    public void setItem(int slot, ItemStack item) {
    }

    public int getSize() {
        return 0;
    }

    public void clear() {
    }

    public void addItem(ItemStack item) {
    }

    public ItemStack removeItem(int slot) {
        return null;
    }

    public java.util.List<ItemStack> getAllItems() {
        return java.util.List.of();
    }

    public void setAllItems(java.util.List<ItemStack> items) {
    }

    public int countItem(String itemId) {
        return 0;
    }

    public boolean containsItem(String itemId) {
        return false;
    }
}
