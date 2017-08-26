package Domain.Model.User;

import Domain.Common.AggregateRoot;
import Domain.Common.Uuid;

final public class User extends AggregateRoot
{
    private UserName name;
    private Email    email;

    User(String id, UserName name, Email email)
    {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public static User register(String name, String email) throws Exception
    {
        return new User(Uuid.generate(), new UserName(name), new Email(email));
    }

    public UserName name()
    {
        return name;
    }

    public Email email()
    {
        return email;
    }

    @Override
    public String toString()
    {
        return name() + ": " + email();
    }
}
