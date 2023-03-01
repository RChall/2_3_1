package com.dmitrog.spring.myApp.service;

import com.dmitrog.spring.myApp.entity.User;
import java.util.List;

public interface UserService {
    void addUser(User user);
    List<User> getAllUsers();
    public User getUserById(int id);
    void deleteUserById(int id);
    public void updateUser(int Id, String name, String lastName, String country, int age);
    public void updateUser(User user);

}
