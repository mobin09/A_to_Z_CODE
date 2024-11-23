package com.demo.testapplication.AOP;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class Employee {

    @GetMapping("/fetch-employee")
    public String fetchEmployee(){
        System.out.println("inside the fetch employee method");
        return "Employee Fetched";
    }
}
