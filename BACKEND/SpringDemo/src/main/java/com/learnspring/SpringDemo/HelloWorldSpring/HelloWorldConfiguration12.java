package com.learnspring.SpringDemo.HelloWorldSpring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HelloWorldConfiguration12{
	
	@Bean
	public String getName() {
		return "Mobin Arshad";
	}
	
	@Bean
	public Integer getAge() {
		return 26;
	}
	
	@Bean
	public Person getPerson() {
		return new Person("Washim", "Arshad");
	}
	

}
