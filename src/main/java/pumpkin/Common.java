package pumpkin;

/** Shared enums used by the generated Pumpkin API. */
public final class Common {
    private Common() {
    }

    public enum GameMode {
        SURVIVAL, CREATIVE, ADVENTURE, SPECTATOR
    }

    public enum Hand {
        LEFT, RIGHT
    }

    public static class RgbColor {
        public final int red, green, blue;
        public RgbColor(int red, int green, int blue) {
            this.red = red; this.green = green; this.blue = blue;
        }
    }

    public static class ArgbColor {
        public final int alpha, red, green, blue;
        public ArgbColor(int alpha, int red, int green, int blue) {
            this.alpha = alpha; this.red = red; this.green = green; this.blue = blue;
        }
    }

    public enum NamedColor {
        BLACK, DARK_BLUE, DARK_GREEN, DARK_AQUA, DARK_RED, DARK_PURPLE,
        GOLD, GRAY, DARK_GRAY, BLUE, GREEN, AQUA, RED, LIGHT_PURPLE,
        YELLOW, WHITE
    }
}
