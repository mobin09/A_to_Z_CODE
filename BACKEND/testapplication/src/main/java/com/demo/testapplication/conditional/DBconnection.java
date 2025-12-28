package com.demo.testapplication.conditional;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import java.util.Objects;

@Component
public class DBconnection {

    @Autowired(required = false)
    MySqlConnection mySqlConnection;
    @Autowired(required = false)
    NoSqlConnection noSqlConnection;

    @PostConstruct
    public void init(){
        System.out.println("DBconnection bean is created");
        System.out.println("is MySqlConnection bean  is null::" + Objects.isNull(mySqlConnection));
        System.out.println("is NoSqlConnection bean is null::" + Objects.isNull(noSqlConnection));
    }

}
