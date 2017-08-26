package Domain.Common;

import java.lang.reflect.Array;
import java.util.List;

abstract public class AggregateRoot implements AggregateRootInterface
{
    protected String               id;
    private   List<EventInterface> events;

    public String id()
    {
        return id;
    }

    @Override
    public void recordEvent(EventInterface event)
    {
        events.add(event);
    }

    @Override
    public List<EventInterface> releaseEvents()
    {
        return events;
    }

    @Override
    public void clearEvents()
    {
        events.clear();
    }
}
