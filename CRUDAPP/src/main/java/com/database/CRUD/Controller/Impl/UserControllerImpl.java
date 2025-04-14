package com.database.CRUD.Controller.Impl;

import com.database.CRUD.Controller.UserController;
import com.database.CRUD.Model.User;
import com.database.CRUD.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Controller")

public class UserControllerImpl implements UserController {

    @Autowired
    private UserService userService;

    @Override
    @GetMapping("/getallusers")
    public List<User> getAll() {
        return userService.getAllUsers();
    }

    @Override
    @GetMapping("/getuser/{id}")
    public User findById(@PathVariable Long id) {
        return userService.searchById(id);
    }

    @Override
    @PostMapping("/createuser")
    public void createUser(@RequestBody User user) {
        userService.saveUser(user);
    }

    @Override
    @DeleteMapping("/deleteuser/{id}")
    public void removeUser(@PathVariable Long id) {
        userService.deleteUser(id);
    }

    @Override
    @PutMapping("/updateuser/{id}")
    public void updateUser(@PathVariable Long id, @RequestBody User user) {
        userService.updateUser(id, user);
    }
}
