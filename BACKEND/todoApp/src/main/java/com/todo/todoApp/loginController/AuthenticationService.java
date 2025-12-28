package com.todo.todoApp.loginController;

import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {
     public boolean isValidUser(String userName, String password) {    	 
    	 return userName.equals("Admin") && password.equals("Admin");
    	 
     }
}
