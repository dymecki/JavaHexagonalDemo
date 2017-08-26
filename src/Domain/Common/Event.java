package Domain.Common;

public abstract class Event implements EventInterface
{
    @Override
    public String name()
    {
        return this.getClass().toString();
    }
}
