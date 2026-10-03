package com.kafka.producer.controller;


import com.kafka.producer.model.Order;
import com.kafka.producer.service.OrderProducerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/orders")
public class OrderController {
   @Autowired
    OrderProducerService orderProducerService;

   @PostMapping("/with-key")
    public ResponseEntity<String> sendWithKey(@RequestBody Order order){
       orderProducerService.sendWithKey(order);
       return ResponseEntity.accepted().body("Order created and Event Published");
   }
}
