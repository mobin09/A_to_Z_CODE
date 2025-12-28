package com.demo.testapplication.conditional;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;


@Component
@ConditionalOnProperty(prefix = "MySQL", name = "enabled", havingValue = "true", matchIfMissing = false)
public class MySqlConnection {
    public MySqlConnection(){
        System.out.println("MySqlConnection is initialized");
    }
}
