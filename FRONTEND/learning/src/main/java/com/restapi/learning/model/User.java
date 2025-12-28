package com.restapi.learning.model;

public class User {
    private String name;
    private int age;
    private int id;
    public User(String name, int age){
        this.name = name;
        this.age = age;
    }

    public User(String name, int age, int id){
        this.name = name;
        this.age = age;
        this.id = id;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }

    public int getId(){
        return id;
    }
}
