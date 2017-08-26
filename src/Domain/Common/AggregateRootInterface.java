package Domain.Common;

import java.util.List;

public interface AggregateRootInterface {
    public void recordEvent(EventInterface event);
    public List<EventInterface> releaseEvents();
    public void clearEvents();
}
