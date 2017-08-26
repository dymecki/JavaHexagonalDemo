package Domain.Common;

import java.util.UUID;

public final class Uuid
{
    private UUID id;

    Uuid(UUID id)
    {
        this.id = id;
    }

    public UUID id()
    {
        return id;
    }

    public static String generate()
    {
        return UUID.randomUUID().toString();
    }

    public static Uuid fromString(String userId)
    {
        return new Uuid(UUID.fromString(userId));
    }
}
