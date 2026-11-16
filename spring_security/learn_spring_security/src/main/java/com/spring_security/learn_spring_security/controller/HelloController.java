package com.spring_security.learn_spring_security.controller;

//import org.springframework.security.core.Authentication;
//import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HelloController {

    @GetMapping("/hello-world")
    public String hello(){
//        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
//        return auth.getName().toString() + " " + auth.getAuthorities().toString();
        //return "Hello From the Secure";

        return "Hello";

    }

}
