package pumpkin;

/** 128-bit UUID represented as two unsigned 64-bit values. */
public class Uuid {
    public final long high;
    public final long low;

    public Uuid(long high, long low) {
        this.high = high;
        this.low = low;
    }

    public static Uuid random() {
        return new Uuid(0L, 0L);
    }

    public static Uuid parse(String value) {
        return new Uuid(0L, 0L);
    }

    @Override
    public String toString() {
        return "00000000-0000-0000-0000-000000000000";
    }
}
