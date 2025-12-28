package com.mobin.learn_spring_aop.aopexample.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD)  // this will only used for method
@Retention(RetentionPolicy.RUNTIME) // at run time
public @interface TrackTime {

}
