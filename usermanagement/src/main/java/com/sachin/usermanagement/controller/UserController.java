package com.sachin.usermanagement.controller;

import com.sachin.usermanagement.model.User;
import com.sachin.usermanagement.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class UserController {

    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/users")
    public List<User> getUser() {
        return userService.getAllUsers();
    }

    @PostMapping("/user")
    public User saveUser(@RequestBody User user) {
        return userService.saveUser(user);
    }

    @DeleteMapping("/user")
    public User removeUser(@RequestBody User user) {
        return userService.removeUser(user);
    }
}
