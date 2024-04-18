package app.service;

import app.domain.User;

public interface UserService {

    User getById(Long id);

    User save(User user);

}
