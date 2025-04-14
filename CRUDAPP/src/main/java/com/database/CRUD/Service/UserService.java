package com.database.CRUD.Service;

import com.database.CRUD.Model.User;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();

    User searchById(Long id);

    void saveUser(User user);

    void deleteUser(Long id);

    void updateUser(Long id, User user);
}
