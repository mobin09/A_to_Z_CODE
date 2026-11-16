package com.spring_security.learn_spring_security.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class AccountController {

    @GetMapping("/accounts")
    public ResponseEntity<String> getAccount(){
        return ResponseEntity.status(HttpStatus.OK).body("Account Dashboard");
    }

    @GetMapping("/admin")
    public ResponseEntity<String> getAdmin(){
        return ResponseEntity.status(HttpStatus.OK).body("Admin Dashboard");
    }

}
