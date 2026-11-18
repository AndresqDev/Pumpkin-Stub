package pumpkin;

/** Java-friendly custom AI goal. */
public interface AiGoal {
    default boolean canStart(Server server, World.Entity entity) {
        return true;
    }

    default boolean shouldContinue(Server server, World.Entity entity) {
        return true;
    }

    default void start(Server server, World.Entity entity) {
    }

    default void tick(Server server, World.Entity entity) {
    }

    default void stop(Server server, World.Entity entity) {
    }
}
