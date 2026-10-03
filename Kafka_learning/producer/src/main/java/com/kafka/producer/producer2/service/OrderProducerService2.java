package com.kafka.producer.producer2.service;

import com.kafka.producer.model.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.stereotype.Service;

import java.util.concurrent.CompletableFuture;

@Service
public class OrderProducerService2 {

    @Autowired
    private KafkaTemplate<String, Order> kafkaTemplate;

    @Autowired
    @Qualifier("customSerializerKafkaTemplate")
    private KafkaTemplate<String, Order> customeSerializerKafkaTemplate;

    public void sendWithoutKeyKey(Order order){
        CompletableFuture<SendResult<String, Order>> future =
                kafkaTemplate.send("order-events", order);

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
