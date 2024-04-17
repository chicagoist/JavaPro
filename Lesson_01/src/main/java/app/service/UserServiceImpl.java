package app.service;

import app.domain.User;
import app.repository.UserRepository;

public class UserServiceImpl implements UserService{

    private UserRepository repository;

    public UserServiceImpl(UserRepository repository) {
        this.repository = repository;
    }

    @Override
    public User getById(Long id) {
        return repository.getById(id);
    }

    @Override
    public User save(User user) {
        return repository.save(user);
    }
}
