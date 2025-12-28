package com.mobin.learn_spring_aop.aopexample.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Configuration
@Aspect
public class LoggingAspect {
    private Logger logger = LoggerFactory.getLogger(getClass());

    @Before("com.mobin.learn_spring_aop.aopexample.aspects.CommonPointCutConfig.businessPackageConfig()")
     public void logMethodCallBeforeExecution(JoinPoint joinPoint){
         logger.info("Before Aspect Method is called - {}", joinPoint);
     }

    @After("com.mobin.learn_spring_aop.aopexample.aspects.CommonPointCutConfig.businessPackageConfig()")
    public void logMethodCallAfterExection(JoinPoint joinPoint){
        logger.info("After Aspect Method is called - {}", joinPoint);
    }

    @AfterThrowing(
         pointcut = "com.mobin.learn_spring_aop.aopexample.aspects.CommonPointCutConfig.businessPackageConfig()",
            throwing = "exception"
    )
    public void logMethodCallAfterException(JoinPoint joinPoint, Exception exception){
        logger.info("AfterThrowing Aspect Method is called - {} and Exception is- {}", joinPoint, exception);
    }

    @AfterReturning(
            pointcut = "com.mobin.learn_spring_aop.aopexample.aspects.CommonPointCutConfig.businessPackageConfig()",
            returning = "returnValue"
    )
    public void logMethodCallAfterSuccessfullExecution(JoinPoint joinPoint, Object returnValue){
        logger.info("After successful returning - {} and return value is - {}", joinPoint, returnValue);
    }

}
