package com.mobin.learn_spring_aop.aopexample.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Configuration
@Aspect
public class PerformanceTrackingAspect {

    private Logger logger = LoggerFactory.getLogger(getClass());

    @Around("com.mobin.learn_spring_aop.aopexample.aspects.CommonPointCutConfig.trackTimeAnnotation()")
    public Object findExecutionTIme(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        // start a timer
        long startTime = System.currentTimeMillis();
        // execute method
        Object returnValue = proceedingJoinPoint.proceed(); // proceed with the target method
        // stop a timer
        long endTime = System.currentTimeMillis();
        long duration = endTime - startTime;
        logger.info("@Around aspect - method name is - {} and duration of execution is {} ", proceedingJoinPoint, duration);
        return returnValue;
    }
}
