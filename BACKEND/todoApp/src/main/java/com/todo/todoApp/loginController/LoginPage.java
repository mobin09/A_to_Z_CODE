package com.todo.todoApp.loginController;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginPage {
	
	private Logger logger = LoggerFactory.getLogger(getClass());

	@RequestMapping("/loginDemo")
	// http://127.0.0.1:8443/login?name=Mobin
    public String loginUser(@RequestParam String name, ModelMap model) {
		model.put("name", name);
		logger.debug("Requested name is {}", name);
		logger.info("This will printed at info level");
		logger.warn("This message is printed at the warn level");
    	return "LOGIN/login";
    }
}


// whenever you want to pass anything from controller to jsp we can do that by putting in a model