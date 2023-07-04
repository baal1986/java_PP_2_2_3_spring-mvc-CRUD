package web.dao;

import web.model.User;

import java.util.List;
import java.util.Optional;

public interface UserDao {
    List<User> allUsers();

    void add(User user);

    void delete(User user);

    void edit(User user);

    User getById(Long id);
}
