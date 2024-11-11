package com.demo.testapplication.controller;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
@RequestMapping("/api")
public class TestController1 {
    @Autowired
    User user;
    @Autowired
    Student student;

    public TestController1(){
         System.out.println("Test Controller is initialized");
    }

    @PostConstruct
    public void init(){
        System.out.println("HashCode of TestController1" + this.hashCode());
        System.out.println("Initial user class hashCode is::" + user.hashCode());
        System.out.println("Student class hash code::" + student.hashCode());
    }

    @GetMapping("/fetchUser")
    public ResponseEntity<String> getUsersData(){
        System.out.println("hash code of TestController1::" + this.hashCode());
        System.out.println("hash code of User::" + user.hashCode());
        System.out.println("Student class hash code is ::" + student.hashCode());
        return ResponseEntity.status(HttpStatus.OK).body("hh");
    }

}
