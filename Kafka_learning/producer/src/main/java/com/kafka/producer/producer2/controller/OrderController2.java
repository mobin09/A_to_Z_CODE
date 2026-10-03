package com.kafka.producer.producer2.controller;

import com.kafka.producer.model.Order;
import com.kafka.producer.producer2.config.OrderSummarySerializer;
import com.kafka.producer.producer2.service.OrderProducerService2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/orders2")
public class OrderController2 {

        @Autowired
        OrderProducerService2 orderProducerService;

        @PostMapping("/with-no-key")
        public ResponseEntity<String> sendWithoutKey(@RequestBody Order order){
            orderProducerService.sendWithoutKeyKey(order);
            return ResponseEntity.accepted().body("Order created and Event Published");
        }
}
