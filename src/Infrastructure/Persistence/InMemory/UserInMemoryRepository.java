package Infrastructure.Persistence.InMemory;

import Domain.Common.Uuid;
import Domain.Model.User.User;
import Domain.Model.User.UserRepositoryInterface;

import java.util.HashMap;
import java.util.Map;

public class UserInMemoryRepository implements UserRepositoryInterface
{
    private Map<String, User> repository = new HashMap<>();

    @Override
    public void save(User user)
    {
        repository.put(user.id(), user);
    }

    @Override
    public User findById(Uuid userId) throws Exception
    {
        User result = repository.get(userId);

        if (result != null) {
            return result;
        }

        throw new Exception("No user in the repository for UserId: " + userId);
    }

    @Override
    public void remove(User user)
    {
        repository.remove(user.id());
    }
}
