package com.demo.testapplication.jdbc.model;

public class User {
    private int userId;
    private String userName;
    private int age;
    public void setUserId(int userId) {
        this.userId = userId;
    }
    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public int getUserId(){
        return userId;
    }
}
