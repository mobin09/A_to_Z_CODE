package com.mobin.learn_spring_aop.aopexample.aspects;

import org.aspectj.lang.annotation.Pointcut;


public class CommonPointCutConfig {
    @Pointcut("execution(* com.mobin.learn_spring_aop.aopexample.business.*.*(..))")
    public void businessPackageConfig(){}

    @Pointcut("bean(*Service*)")
    public void allPackageConfigUsingBean(){}

    @Pointcut("@annotation(com.mobin.learn_spring_aop.aopexample.annotations.TrackTime)")
    public void trackTimeAnnotation(){}
}
