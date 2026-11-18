package pumpkin;

/** No-op command registry. */
public class CommandRegistry {
    public void register(PluginContext context, Command command, String permission, CommandHandler handler) {
    }

    public void registerWithArgs(PluginContext context, Command command, String permission,
                                 CommandHandler rootHandler, CommandHandler argsHandler) {
    }

    public void onSuggestions(Command.CommandNode node, SuggestionHandler handler) {
    }

    @FunctionalInterface
    public interface SuggestionHandler {
        Command.CommandSuggestions suggest(Command.CommandSender sender, Server server,
                                           Command.SuggestionRequest request);
    }
}
