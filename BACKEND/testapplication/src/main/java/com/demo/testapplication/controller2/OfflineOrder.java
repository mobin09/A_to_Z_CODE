package com.demo.testapplication.controller2;



public class OfflineOrder implements Order{
    public OfflineOrder(){
        System.out.println("Offline order is initialized");
    }
    public void createOrder(){
        System.out.println("Offline order is created");
    }
}
