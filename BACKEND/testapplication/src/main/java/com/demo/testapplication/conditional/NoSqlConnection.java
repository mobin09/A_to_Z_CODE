package com.demo.testapplication.conditional;


import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(prefix = "NoSQL", name = "enabled", havingValue = "true", matchIfMissing = false)
public class NoSqlConnection {
   public NoSqlConnection(){
       System.out.println("NoSqlConnection is initialized");
   }
}
