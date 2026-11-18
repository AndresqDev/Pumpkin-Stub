package pumpkin;

/** Minimal item stack facade. */
public class ItemStack {
    private final String item;
    private final int count;

    public ItemStack(String item, int count) {
        this.item = item;
        this.count = count;
    }

    public static ItemStack of(String item, int count) {
        return new ItemStack(item, count);
    }

    public static ItemStack of(String item) {
        return new ItemStack(item, 1);
    }

    public String getItem() {
        return item;
    }

    public int getCount() {
        return count;
    }
}
