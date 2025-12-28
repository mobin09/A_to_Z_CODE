package com.demo.testapplication.controller;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Student {
    @Autowired
    User user;

    public Student(){
        System.out.println("Student Class initialized");
    }

    @PostConstruct
    public void init(){
        System.out.println("Student class hash code::" + this.hashCode() +
                "\nUser class Hash code is::" + user.hashCode());
    }
}
