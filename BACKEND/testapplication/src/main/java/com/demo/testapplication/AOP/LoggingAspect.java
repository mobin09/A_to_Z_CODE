package com.demo.testapplication.AOP;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {
    @Before("execution(public String com.demo.testapplication.AOP.Employee.fetchEmployee())")
    public void beforeMethod(){
        System.out.println("********* Inside Aspect Before Method **********");
    }
}
