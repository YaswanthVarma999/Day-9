package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.*;

import com.example.demo.user.User;

@RestController
@RequestMapping("/api/users")
public class UserController {

    private List<User> users = new ArrayList<>(); // In-memory storage

    @PostMapping
    public String saveUser(@RequestBody User user) {
        users.add(user); // Add user to list
        return "User is saved!";
    }

    @GetMapping("/{id}")
    public User getUser(@PathVariable Integer id) {
        return users.stream()
                    .filter(user -> user.getId().equals(id))
                    .findFirst()
                    .orElse(null);
    }

    @GetMapping
    public List<User> getAllUsers() {
        return users;
    }

    @DeleteMapping("/{id}")
    public String deleteUser(@PathVariable Integer id) {
        boolean removed = users.removeIf(user -> user.getId().equals(id));
        if (removed) {
            return "User with ID " + id + " is deleted!";
        } else {
            return "User with ID " + id + " not found!";
        }
    }
}
