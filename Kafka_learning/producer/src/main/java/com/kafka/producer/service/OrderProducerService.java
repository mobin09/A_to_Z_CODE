package com.kafka.producer.service;

import com.kafka.producer.model.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.stereotype.Service;

import java.util.concurrent.CompletableFuture;

@Service
public class OrderProducerService {
    @Autowired
    private KafkaTemplate<String, Order> kafkaTemplate;
    public void sendWithKey(Order order){
        String key = order.getOrderId();
        CompletableFuture<SendResult<String, Order>> future =
                kafkaTemplate.send("order-events", key, order);

        future.whenComplete((result, ex) ->{
           if(ex == null){
               System.out.println("Order Events send successfully");
               System.out.println("Partition::" + result.getRecordMetadata().partition());
               System.out.println("Offset::" + result.getRecordMetadata().offset());
           }else{
               System.out.println("Failed to send order events::" + ex.getMessage());
           }
        });

    }
}
