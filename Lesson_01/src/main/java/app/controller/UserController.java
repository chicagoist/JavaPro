package app.controller;

import app.domain.User;
import app.service.UserService;

public class UserController {

    private UserService service;

    public UserController(UserService service) {
        this.service = service;
    }

    public User getById(Long id) {
        return service.getById(id);
    }

    public User save(User user) {
        return service.save(user);
    }
}
