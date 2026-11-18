package pumpkin;

/** No-op event registry. */
public class EventRegistry {
    public EventSubscription listen(PluginContext context, EventType type, EventPriority priority,
                                    boolean blocking, EventListener listener) {
        return new EventSubscription();
    }
}
