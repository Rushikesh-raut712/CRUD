package com.database.CRUD.Service.Impl;

import com.database.CRUD.Dao.UserDao;
import com.database.CRUD.Model.User;
import com.database.CRUD.Service.UserService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional

public class UserServiceImpl implements UserService {
    @Autowired
    public UserDao userDao;

    public List<User> getAllUsers(){
        return userDao.getAll();
    }

    public User searchById(Long id){
        return userDao.searchById(id);
    }

    public void saveUser(User user){
        userDao.saveUser(user);
    }

    public void deleteUser(Long id){
        userDao.deleteUser(id);
    }

    public void updateUser(Long id, User user){
        userDao.updateUser(id, user);
    }
}
