package com.sachin.usermanagement.service;

import com.sachin.usermanagement.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    private List<User> users = new ArrayList<>();

    public UserService() {
        User user = new User("dummy", "dummy@gmail.com", 10);
        users.add(user);
    }

    public List<User> getAllUsers() {
        System.out.println(users);
        return users;
    }

    public User saveUser(User user) {
        users.add(new User(user.getName(), user.getEmail(), user.getAge()));
        return user;
    }


    public User removeUser(User user) {
        users.remove(user);
        return user;
    }
}
