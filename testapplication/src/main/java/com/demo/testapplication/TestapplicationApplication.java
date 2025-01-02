package com.demo.testapplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@ComponentScan({"com.demo.testapplication.async"})
@EnableAsync
public class TestapplicationApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestapplicationApplication.class, args);
	}

}
