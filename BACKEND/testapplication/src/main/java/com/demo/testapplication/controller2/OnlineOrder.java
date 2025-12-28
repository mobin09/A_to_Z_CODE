package com.demo.testapplication.controller2;

public class OnlineOrder implements  Order{
    public OnlineOrder(){
        System.out.println("Online Order is initialized");
    }
    public void createOrder(){
        // online order is created
        System.out.println("Online Order is created");
    }
}
