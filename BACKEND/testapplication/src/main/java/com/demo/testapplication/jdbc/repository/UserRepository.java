package com.demo.testapplication.jdbc.repository;

import com.demo.testapplication.jdbc.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserRepository {
    @Autowired
    JdbcTemplate jdbcTemplate;

    public void createTable(){
        String q = "CREATE TABLE users (user_id INT AUTO_INCREMENT PRIMARY KEY, user_name VARCHAR(100), age INT)";
        jdbcTemplate.execute(q);
    }

    public void insertUser(String name, int age){
        String insertQuery = "INSERT INTO users (user_name, age) VALUES(?, ?)";
        jdbcTemplate.update(insertQuery, name, age);
    }

    public List<User> getUsers(){
        String selectQuery = "SELECT * FROM users";
        return jdbcTemplate.query(selectQuery, (rs,rowNum) -> {
               User user = new User();
               user.setUserId(rs.getInt("user_id"));
               user.setUserName(rs.getString("user_name"));
               user.setAge(rs.getInt("age"));
               return  user;
        } );
    }

}
