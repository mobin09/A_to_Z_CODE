package com.demo.testapplication.jdbc;


import com.demo.testapplication.jdbc.model.User;
import com.demo.testapplication.jdbc.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping(value = "/api")
public class UserService {
   @Autowired
   UserRepository userRepository;

   public void createTable(){
       userRepository.createTable();
   }

   public void insertUser(String name, int age){
       userRepository.insertUser(name, age);
   }

   @GetMapping("/get-user-jdbc-template")
   public List<User> readUserData(){
       createTable();
       insertUser("Mobin", 26);
       insertUser("Washim", 24);
      List<User> users =  userRepository.getUsers();
      for(User user : users){
            System.out.println("ID::" + user.getUserId() +"/nName::"+user.getUserName()+"/nAge::"+user.getAge());
      }

      return users;

   }

}
