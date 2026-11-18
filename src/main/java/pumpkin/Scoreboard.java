package pumpkin;

/** Java-friendly scoreboard facade. */
public class Scoreboard {
    public enum RenderType { INTEGER, HEARTS }
    public enum DisplaySlot { PLAYER_LIST, SIDEBAR, BELOW_NAME }
    public enum NametagVisibility { ALWAYS, NEVER, HIDE_FOR_OTHER_TEAMS, HIDE_FOR_OWN_TEAM }
    public enum CollisionRule { ALWAYS, NEVER, PUSH_OTHER_TEAMS, PUSH_OWN_TEAM }

    public static class TeamSettings {
        public TextComponent displayName;
        public boolean friendlyFire;
        public boolean seeFriendlyInvisibles;
        public NametagVisibility nametagVisibility = NametagVisibility.ALWAYS;
        public CollisionRule collisionRule = CollisionRule.ALWAYS;
        public Common.NamedColor color = Common.NamedColor.WHITE;
        public TextComponent prefix = TextComponent.text("");
        public TextComponent suffix = TextComponent.text("");

        public TeamSettings(TextComponent displayName, boolean friendlyFire,
                            boolean seeFriendlyInvisibles,
                            NametagVisibility nametagVisibility,
                            CollisionRule collisionRule,
                            Common.NamedColor color,
                            TextComponent prefix, TextComponent suffix) {
            this.displayName = displayName;
            this.friendlyFire = friendlyFire;
            this.seeFriendlyInvisibles = seeFriendlyInvisibles;
            this.nametagVisibility = nametagVisibility;
            this.collisionRule = collisionRule;
            this.color = color;
            this.prefix = prefix;
            this.suffix = suffix;
        }
    }

    public void addObjective(String name, TextComponent displayName, RenderType renderType, Object numberFormat) {
    }

    public void updateObjective(String name, TextComponent displayName, RenderType renderType, Object numberFormat) {
    }

    public void removeObjective(String name) {
    }

    public void setDisplaySlot(DisplaySlot slot, String objectiveName) {
    }

    public void clearDisplaySlot(DisplaySlot slot) {
    }

    public void updateScore(String entityName, String objectiveName, int value, Object numberFormat) {
    }

    public void addScore(String entityName, String objectiveName, int delta) {
    }

    public void removeScore(String entityName, String objectiveName) {
    }

    public void createTeam(String name, TeamSettings settings) {
    }

    public void updateTeam(String name, TeamSettings settings) {
    }

    public void removeTeam(String name) {
    }

    public void addPlayerToTeam(String teamName, String playerName) {
    }

    public void removePlayerFromTeam(String teamName, String playerName) {
    }
}
