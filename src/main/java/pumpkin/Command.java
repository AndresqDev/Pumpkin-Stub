package pumpkin;

import java.util.List;

/** Command definition and the Java-friendly portion of the generated command API. */
public class Command {
    private final List<String> names;
    private final String description;

    public Command(List<String> names, String description) {
        this.names = List.copyOf(names);
        this.description = description;
    }

    public List<String> getNames() {
        return names;
    }

    public String getDescription() {
        return description;
    }

    public void then(CommandNode node) {
    }

    public enum PermissionLevel {
        ZERO, ONE, TWO, THREE, FOUR
    }

    /** Command sender accepted by command callbacks. */
    public interface CommandSender {
        String getName();

        void sendMessage(TextComponent text);

        void sendSystemMessage(TextComponent text);

        void sendError(TextComponent text);

        void setSuccessCount(int count);

        boolean isPlayer();

        boolean isConsole();

        Player asPlayer();

        PermissionLevel permissionLevel();

        boolean hasPermissionLevel(PermissionLevel level);

        boolean hasPermission(Server server, String node);

        Position position();

        World world();
    }

    public static class ConsumedArgs {
        public Arg getValue(String key) {
            return null;
        }
    }

    /** Parsed command argument. */
    public static class Arg {
        public String asString() {
            return "";
        }

        public int asInt() {
            return 0;
        }

        public boolean asBool() {
            return false;
        }

        public Player asPlayer() {
            return null;
        }
    }

    public static class SuggestionRequest {
        public String input = "";
        public int cursor;
        public int start;
        public String remaining = "";
    }

    public static class CommandSuggestion {
        public String value = "";
        public TextComponent tooltip;

        public CommandSuggestion() {
        }

        public CommandSuggestion(String value, TextComponent tooltip) {
            this.value = value;
            this.tooltip = tooltip;
        }
    }

    public static class CommandSuggestions {
        public int start;
        public int length;
        public List<CommandSuggestion> values = List.of();

        public CommandSuggestions() {
        }

        public CommandSuggestions(int start, int length, List<CommandSuggestion> values) {
            this.start = start;
            this.length = length;
            this.values = values;
        }
    }

    public static class CommandNode {
        public static CommandNode literal(String name) {
            return new CommandNode();
        }

        public static CommandNode argument(String name, ArgumentType type) {
            return new CommandNode();
        }

        public CommandNode then(CommandNode node) {
            return this;
        }

        public void executeWithHandlerId(int handlerId) {
        }

        public void suggestWithHandlerId(int handlerId) {
        }
    }

    public static class ArgumentType {
        public static ArgumentType string() {
            return new ArgumentType();
        }

        public static ArgumentType integer(int min, int max) {
            return new ArgumentType();
        }

        public static ArgumentType bool() {
            return new ArgumentType();
        }
    }
}
