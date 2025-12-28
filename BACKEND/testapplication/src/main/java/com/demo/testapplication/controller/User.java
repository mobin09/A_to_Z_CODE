package com.demo.testapplication.controller;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class User {
   public User(){
       System.out.println("User is created");
   }

   @PostConstruct
    public void init(){
       System.out.println("User class has code is:::" + this.hashCode());
   }
}
