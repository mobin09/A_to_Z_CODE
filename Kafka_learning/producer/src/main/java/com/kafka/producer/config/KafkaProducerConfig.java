package com.kafka.producer.config;


import com.kafka.producer.model.Order;
import com.kafka.producer.producer2.config.KafkaProducerConfig2;
import org.apache.kafka.clients.admin.NewTopic;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.common.config.TopicConfig;
import org.springframework.boot.kafka.autoconfigure.KafkaProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;
import org.springframework.kafka.core.DefaultKafkaProducerFactory;
import org.springframework.kafka.core.KafkaTemplate;

import java.util.HashMap;
import java.util.Map;

@Configuration
public class KafkaProducerConfig {

    @Bean
    public NewTopic orderEventsTopic(){
       return TopicBuilder.name("order-events")
               .partitions(4)
               .replicas(2)
               .config(TopicConfig.RETENTION_MS_CONFIG, "604800000")
               .config(TopicConfig.CLEANUP_POLICY_CONFIG, "delete")
               .config(TopicConfig.MIN_IN_SYNC_REPLICAS_CONFIG, "2")
               .config(TopicConfig.SEGMENT_BYTES_CONFIG, "1073741824")
               .build();
   }

   @Bean
    public KafkaTemplate<String, Order> customSerializerKafkaTemplate(KafkaProperties kafkaProperties){
        // Start with all producer properties from application.properties
       Map<String, Object> props = new HashMap<>(kafkaProperties.buildProducerProperties());
       // Override ONLY the value serializer - everything else stays the same
       props.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, KafkaProducerConfig2.class);
       DefaultKafkaProducerFactory<String,Order> factory = new DefaultKafkaProducerFactory<>(props);
       return new KafkaTemplate<>(factory);

   }



}
