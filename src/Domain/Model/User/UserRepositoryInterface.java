package Domain.Model.User;

import Domain.Common.Uuid;

public interface UserRepositoryInterface
{
    public void save(User user);

    public User findById(Uuid userId) throws Exception;

    public void remove(User user);
}
