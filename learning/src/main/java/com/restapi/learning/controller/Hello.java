package com.restapi.learning.controller;

import com.restapi.learning.model.User;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {

    @GetMapping("/hello")
    public String hello() {
        return "Hello, World!";
    }

    @GetMapping("/get-user")
    public ResponseEntity<String> getUsers(){
        HttpHeaders headers = new HttpHeaders();
        headers.add("key1", "some value1");
        headers.add("key2", "some value2");

        return  ResponseEntity.status(HttpStatus.OK).headers(headers).body("My Response Body Object Go here");
    }

    @GetMapping("/get-admin")
    public ResponseEntity<Void> getAdmin(){
        HttpHeaders headers = new HttpHeaders();
        headers.add("key1", "Value1");
        return ResponseEntity.status(HttpStatus.OK).headers(headers).build();
    }

    @GetMapping("/user-info")
    public User getUserInfo(){
        User u = new User("Mobin", 27);
        return u;
    }


    @GetMapping("/old-get-user")
    public ResponseEntity<Void> getOldUser(){
        return ResponseEntity.status(HttpStatus.MOVED_PERMANENTLY).header("Location", "/new-get-user").build();
    }

    @GetMapping("/new-get-user")
    public ResponseEntity<String> getNewUser(){
        return ResponseEntity.status(HttpStatus.OK).body("New Users are here...");
    }



}
