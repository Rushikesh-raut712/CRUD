package com.database.CRUD.Dao.Impl;

import com.database.CRUD.Dao.UserDao;
import com.database.CRUD.Model.User;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Transactional
public class UserDaoImpl implements UserDao {
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<User> getAll() {
        return entityManager.createQuery("from User", User.class).getResultList();
    }

    @Override
    public User searchById(Long id){
        return entityManager.find(User.class, id);
    }

    @Override
    public void saveUser(User user){
        entityManager.persist(user);
    }

    @Override
    public void deleteUser(Long id){
        User user = searchById(id);
        if(user != null){
            entityManager.remove(user);
        }
    }

    @Override
    public void updateUser(Long id, User user) {
        User existingUser = searchById(id);
        if (existingUser != null) {
            user.setId(id);
            entityManager.merge(user);
        }
    }

}
