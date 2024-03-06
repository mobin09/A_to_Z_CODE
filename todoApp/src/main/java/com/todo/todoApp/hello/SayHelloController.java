package com.todo.todoApp.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SayHelloController {
      // say-hello --> Hello world what are you learning today.
	@ResponseBody
	@RequestMapping("/say-hello") // http://127.0.0.1:8443/say-hello
	public String sayHello() {
		return "Hello world what are you learning today.";
	}
}
