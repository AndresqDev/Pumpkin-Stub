package pumpkin;

import java.util.List;

/**
 * IDE-friendly, runnable skeleton of the Pumpkin plugin lifecycle.
 *
 * <p>Every method has a no-op/default implementation. The class exists so Java
 * code can be written and compiled in IntelliJ IDEA against Pumpkin-shaped
 * APIs before being translated to Kotlin/Wasm. It is not a runtime emulator.</p>
 */
public abstract class PumpkinPlugin {
    private final EventRegistry events = new EventRegistry();
    private final CommandRegistry commands = new CommandRegistry();
    private final TaskScheduler tasks = new TaskScheduler();
    private final IpcRegistry ipc = new IpcRegistry();
    private final AiGoalRegistry aiGoals = new AiGoalRegistry();

    public abstract PluginMetadata metadata();

    public void onLoad(PluginContext context) {
    }

    public void onUnload(PluginContext context) {
    }

    public EventRegistry getEvents() {
        return events;
    }

    public CommandRegistry getCommands() {
        return commands;
    }

    public TaskScheduler getTasks() {
        return tasks;
    }

    public IpcRegistry getIpc() {
        return ipc;
    }

    public AiGoalRegistry getAiGoals() {
        return aiGoals;
    }
}
