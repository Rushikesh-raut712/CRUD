package com.database.CRUD.Dao;

import com.database.CRUD.Model.User;

import java.util.List;

public interface UserDao {
    List<User> getAll();
    User searchById(Long id);
    void saveUser(User user);
    void deleteUser(Long id);
    void updateUser(Long id, User user);
}
