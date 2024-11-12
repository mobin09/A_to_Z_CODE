package com.demo.testapplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.demo.testapplication.conditional"})
public class TestapplicationApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestapplicationApplication.class, args);
	}

}
