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
        System.out.println("User details: " + user.getId()); // 0
        return userService.saveUser(user);
    }

    @DeleteMapping("/user/{id}")
    public String removeUser(@PathVariable int id) {
        return userService.removeUser(id);
    }
}
