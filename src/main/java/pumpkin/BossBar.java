package pumpkin;

/** Boss bar facade matching the generated Pumpkin BossBar resource. */
public class BossBar {
    public enum BossBarColor { PINK, BLUE, RED, GREEN, YELLOW, PURPLE, WHITE }

    public enum BossBarDivision { NO_DIVISION, NOTCHES_6, NOTCHES_10, NOTCHES_12, NOTCHES_20 }

    public BossBar(TextComponent title, BossBarColor color, BossBarDivision division) {
    }

    public void setTitle(TextComponent title) {
    }

    public TextComponent getTitle() {
        return TextComponent.text("");
    }

    public void setHealth(float health) {
    }

    public float getHealth() {
        return 0.0f;
    }

    public void setColor(BossBarColor color) {
    }

    public BossBarColor getColor() {
        return BossBarColor.WHITE;
    }

    public void setDivision(BossBarDivision division) {
    }

    public void addPlayer(Player player) {
    }

    public void removePlayer(Player player) {
    }

    public void removeAll() {
    }
}
