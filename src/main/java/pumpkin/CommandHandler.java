package pumpkin;

/** Command callback used by the stub API. */
@FunctionalInterface
public interface CommandHandler {
    int execute(Command.CommandSender sender, Server server, Command.ConsumedArgs args);
}
