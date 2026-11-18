package pumpkin;

/** Functional listener signature: receives the server and event, returns the event. */
@FunctionalInterface
public interface EventListener {
    Event handle(Server server, Event event);
}
