package com.demo.testapplication.controller2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api")
public class User {

    @Autowired
    Order order;
    @PostMapping("/createOrder")
    public ResponseEntity<String> createOrder(){

        order.createOrder();
       return ResponseEntity.ok("Order is Created");
    }
}
