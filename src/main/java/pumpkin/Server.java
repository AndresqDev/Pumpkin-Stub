package pumpkin;

import java.util.List;

/** No-op server facade. */
public class Server {
    public void broadcastMessage(TextComponent message) {
        broadcast(message.getText());
    }

    public void broadcast(String message) {
    }

    public Player getPlayer(String name) {
        return getPlayerByName(name);
    }

    public Player getPlayerByName(String name) {
        return null;
    }

    public List<Player> getPlayers() {
        return getAllPlayers();
    }

    public List<Player> getAllPlayers() {
        return List.of();
    }

    public World getWorld(String name) {
        return getWorldByName(name);
    }

    public World getWorldByName(String name) {
        return null;
    }

    public List<World> getAllWorlds() {
        return List.of();
    }

    public int getPlayerCount() {
        return 0;
    }

    public double getMspt() {
        return 0.0;
    }

    public double getTps() {
        return 20.0;
    }

    public void executeCommand(String command, CommandSender sender) {
    }

    public Recipe.RecipeManager getRecipeManager() {
        return new Recipe.RecipeManager();
    }

    public Datapack.DatapackManager getDatapackManager() {
        return new Datapack.DatapackManager();
    }

    public Enchantments.EnchantmentManager getEnchantmentManager() {
        return new Enchantments.EnchantmentManager();
    }

    /** Minimal server-side command sender shape. */
    public interface CommandSender {
        void sendMessage(TextComponent message);
    }
}
