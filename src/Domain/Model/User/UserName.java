package Domain.Model.User;

import Domain.Common.ValueObject;

public final class UserName extends ValueObject
{
    private String name;

    UserName(String name)
    {
        this.name = name;
    }

    public String name()
    {
        return name;
    }

    @Override
    public String toString()
    {
        return name();
    }
}
