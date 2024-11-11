package com.demo.testapplication.config;


import com.demo.testapplication.controller2.OfflineOrder;
import com.demo.testapplication.controller2.OnlineOrder;
import com.demo.testapplication.controller2.Order;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
   public Order createOrderType(@Value("${isOnlineOrder}") boolean isOnlineOrder ){
     return isOnlineOrder ? new OnlineOrder(): new OfflineOrder();
   }
}
