package pumpkin;

/** Task body that receives the current server. */
@FunctionalInterface
public interface TaskAction {
    void run(Server server);
}
