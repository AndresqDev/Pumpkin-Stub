package pumpkin;

/** Handle passed to the plugin during load/unload. */
public interface PluginContext {
    Server getServer();

    String getDataFolder();

    void registerPermission(Permission permission);

    void registerCommand(Command command, String permission);
}
