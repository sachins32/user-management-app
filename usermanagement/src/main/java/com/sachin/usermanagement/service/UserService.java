package com.sachin.usermanagement.service;

import com.sachin.usermanagement.model.User;
import com.sachin.usermanagement.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> getAllUsers() {
        return (List<User>) userRepository.findAll();
    }

    public User saveUser(User user) {
        System.out.println("user id before " + user.getId()); // 0
        userRepository.save(user);
        System.out.println("user id after " + user.getId());  // ID is generated and set when save is called
        return user;
    }

    public String removeUser(int id) {
        if (userRepository.existsById(id)) {
            userRepository.deleteById(id);
            return "Deleted";
        }
        return "User Does not exists"; // or throw exceptions
    }
}
