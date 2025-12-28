package com.restapi.learning.controller;


import com.restapi.learning.model.User;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;


public class UserController {

    private Map<Integer, String> users = new HashMap<>();

    // GET: Read all users
    @GetMapping
    public Map<Integer, String> getAllUsers() {
        return users;
    }

    // GET: Read a single user by ID
    @GetMapping("/{id}")
    public String getUserById(@PathVariable int id) {
        return users.getOrDefault(id, "User not found");
    }

    // POST: Create a new user
    @PostMapping
    public String addUser(@RequestParam int id, @RequestParam String name) {
        users.put(id, name);
        return "User added successfully!";
    }

    // PUT: Update an existing user
    @PutMapping("/{id}")
    public String updateUser(@PathVariable int id, @RequestParam String name) {
        users.put(id, name);
        return "User updated successfully!";
    }

    // DELETE: Remove a user
    @DeleteMapping("/{id}")
    public String deleteUser(@PathVariable int id) {
        users.remove(id);
        return "User deleted successfully!";
    }
}

//users/{userid}/todos/{todoid}
