package com.demo.testapplication.AOP02;


import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AspecLogging {
    @Around("execution(* com.demo.testapplication.AOP02.EmployeeUtil.*())")
    public void aspectAroundMethod(ProceedingJoinPoint joinPoint){
        System.out.println("Before the method this will executed");
        try{
            joinPoint.proceed();
        }catch (Throwable throwable){
            throwable.fillInStackTrace();
        }

        System.out.println("After the method this line will be executed");

    }
}
