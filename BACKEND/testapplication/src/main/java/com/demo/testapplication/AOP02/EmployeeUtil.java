package com.demo.testapplication.AOP02;

import org.springframework.stereotype.Component;

@Component
public class EmployeeUtil {
    public void fetchEmployee(){
        System.out.println("Employee Fetching start *********************");
        System.out.println("Employee List");
        System.out.println("Employee Fetching end ***********************");
    }

}
