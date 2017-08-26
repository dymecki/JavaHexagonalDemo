package Domain.Common;

import java.util.List;
import java.util.Map;

public final class EventDispatcher
{
    private Map<String, EventListenerInterface> listeners;

    public void bind(String eventName, EventListenerInterface listener)
    {
//        this.listeners
    }

    public void registered(String eventName)
    {
//        return listeners.get(eventName);
    }
}
