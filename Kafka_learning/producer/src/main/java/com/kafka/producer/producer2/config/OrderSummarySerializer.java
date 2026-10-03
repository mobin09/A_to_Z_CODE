package com.kafka.producer.producer2.config;

import com.kafka.producer.model.Order;
import org.apache.kafka.common.serialization.Serializer;
import tools.jackson.databind.ObjectMapper;
import java.util.LinkedHashMap;
import java.util.Map;

public class OrderSummarySerializer implements Serializer<Order> {
    private final ObjectMapper objectMapper;

    public OrderSummarySerializer(){
        this.objectMapper = new ObjectMapper();
    }
    @Override
    public byte[] serialize(String topic, Order order){
        if(order == null){
            return null;
        }
        try {
            // Build a map with only the fields we want to expose, rest I removed it
            // sensitive value removed
           Map<String, Object> summary = new LinkedHashMap<>();
           summary.put("OrderID", order.getOrderId());
           summary.put("ProductID", order.getProductId());
           return objectMapper.writeValueAsBytes(summary);
        }catch (Exception e){
            throw  new RuntimeException("Failed to Serialize Order Summary", e);
        }
    }
}
