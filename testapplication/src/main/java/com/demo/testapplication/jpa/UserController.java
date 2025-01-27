package com.demo.testapplication.jpa;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/api/")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("test-jpa")
    public List<User> getUsers(){
        User u1 = new User(1L, "Mobin", 26);
        User u2 = new User(2L, "Washim", 24);
        userService.saveUser(u1);
        userService.saveUser(u2);

        return userService.getAllUsers();
    }

}
