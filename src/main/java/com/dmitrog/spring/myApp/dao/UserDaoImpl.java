package com.dmitrog.spring.myApp.dao;

import com.dmitrog.spring.myApp.entity.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;

@Repository
public class UserDaoImpl implements UserDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public void addUser(User user) {
        entityManager.merge(user);
    }

    @Override
    public List<User> getAllUsers() {
        return entityManager.createQuery("select u from User u", User.class).getResultList();
    }

    @Override
    public User getUserById(int id) {
        return entityManager.find(User.class, id);
    }

    @Override
    public void deleteUserById(int id) {
        User user = entityManager.find(User.class,id);
        entityManager.remove(user);

    }

    @Override
    public void updateUser(int Id, String name, String lastName, String country, int age) {
        User user = entityManager.find(User.class, Id);
        user.setName(name);
        user.setLastName(lastName);
        user.setCountry(country);
        user.setAge(age);

        entityManager.merge(user);

    }
    @Override
    public void updateUser(User user) {
        entityManager.merge(user);
    }

}
