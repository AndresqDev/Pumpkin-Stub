package pumpkin;

/** Player inventory handle. */
public class PlayerInventory extends Inventory {
    public Inventory asInventory() {
        return this;
    }

    public int getSelectedSlot() {
        return 0;
    }

    public void setSelectedSlot(int slot) {
    }

    public ItemStack getHelmet() {
        return null;
    }

    public void setHelmet(ItemStack item) {
    }

    public ItemStack getChestplate() {
        return null;
    }

    public void setChestplate(ItemStack item) {
    }

    public ItemStack getLeggings() {
        return null;
    }

    public void setLeggings(ItemStack item) {
    }

    public ItemStack getBoots() {
        return null;
    }

    public void setBoots(ItemStack item) {
    }

    public ItemStack getOffHand() {
        return null;
    }

    public void setOffHand(ItemStack item) {
    }
}
