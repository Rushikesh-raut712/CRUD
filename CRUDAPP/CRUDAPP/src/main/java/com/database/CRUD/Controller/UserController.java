package com.database.CRUD.Controller;

import com.database.CRUD.Model.User;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface UserController {
    List<User> getAll();

    User findById(@PathVariable Long id);

    void createUser(@RequestBody User user);

    void removeUser(@PathVariable Long id);

    void updateUser(@PathVariable Long id, @RequestBody User user);
}
