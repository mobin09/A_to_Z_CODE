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
	
	@ResponseBody
	@RequestMapping("/say-hello-html")
	public String sayHelloHtml() {
		StringBuilder sb = new StringBuilder();
		sb.append("<html>");
		sb.append("<head><title>My First Web Pages</title></head>");
		sb.append("<body>");
		sb.append("<h1>This is my First Web Pages</h1>");
		sb.append("</body>");
		sb.append("</html>");
		return sb.toString();
	}
	
	//@ResponseBody
	@RequestMapping("/admin")
	public String sayHelloToJSP() {
		return "LOGIN/login";
	}
	
	// /src/main/resources/META-INF/resources/WEB-INF/jsp
	@RequestMapping("/home")
	public String home() {
		return "Hello";
	}
	
	
	
	
	
}
