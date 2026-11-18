package pumpkin;

/** No-op logging facade matching Pumpkin's logging shape. */
public final class Logging {
    public enum Level {
        INFO, WARN, ERROR, DEBUG
    }

    private Logging() {
    }

    public static void log(Level level, String message) {
    }

    public static void log(Level level, String message, Throwable throwable) {
    }
}
