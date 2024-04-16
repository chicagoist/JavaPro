package app.repository;

import app.domain.User;

import java.util.List;

public interface UserRepository {

    //CRUD

    // Create
    User save(User user);

    //Read 1
    User getById(Long id);

    //Read 2
    List<User> getAll();

    // Update
    User update(User user);

    //Delete
    void deleteById(Long id);
}
