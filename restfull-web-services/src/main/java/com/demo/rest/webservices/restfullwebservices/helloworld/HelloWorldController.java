package com.demo.rest.webservices.restfullwebservices.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

	@GetMapping(path = "/hello-world")
	public String helloWorld() {
		return "Hello World Mr Mobin";
	}
	
	@GetMapping(path = "/hello-world-bean")
	public HelloWorldBean helloWorldBean() {
		return new HelloWorldBean("Hello World");
		
	}
	
}
