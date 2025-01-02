package com.demo.testapplication.async;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value = "/api")
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping("/getuser")
    public ResponseEntity<String> getUserMethod(){
        System.out.println("inside  getUserMethod:: " + Thread.currentThread().getName());
        userService.asyncMethodTest();
        return ResponseEntity.ok(null);
    }
}
