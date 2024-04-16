package app.repository;

import app.domain.User;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserRepositoryImpl implements UserRepository{

    private Map<Long, User> database = new HashMap<>();
    private Long currentId = 0L;

    public UserRepositoryImpl() {

        save(new User("john@test.com", "passw111"));
        save(new User("maria@test.com", "passw112"));
        save(new User("sara@test.com", "passw113"));
    }

    @Override
    public User save(User user) {
        user.setId(++currentId);
        database.put(currentId, user);
        return user;
    }

    @Override
    public User getById(Long id) {
        return database.get(id);
    }

    @Override
    public List<User> getAll() {
        return null;
    }

    @Override
    public User update(User user) {
        return null;
    }

    @Override
    public void deleteById(Long id) {

        database.remove(id);

    }
}
