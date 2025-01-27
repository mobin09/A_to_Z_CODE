package com.demo.testapplication.jpa;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
   @Autowired
   UserRepository userRepository;

   public void saveUser(User user){
       userRepository.save(user);
   }

   public List<User> getAllUsers(){
     return  userRepository.findAll();
   }

}
