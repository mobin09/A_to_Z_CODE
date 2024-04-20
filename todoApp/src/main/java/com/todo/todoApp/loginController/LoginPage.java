package com.todo.todoApp.loginController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginPage {
	@RequestMapping("/login")
    public String loginUser() {
    	return "LOGIN/login";
    }
}
