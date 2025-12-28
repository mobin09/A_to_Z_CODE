package com.todo.todoApp.loginController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Login {
    
	@Autowired
	private AuthenticationService authservice;
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String loginGet() {
		return "Login";
	}
	
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String loginByPost(@RequestParam String name, @RequestParam String password, ModelMap model) {
		
		
		if(authservice.isValidUser(name, password)) {
			model.put("name", name);
			model.put("password", password);
			return "Welcome";
		}
		
		model.put("ErrorMessage", "Invalid Credentials Please try Again");
		
		return "Login";
		
	}
	
	
	
}
