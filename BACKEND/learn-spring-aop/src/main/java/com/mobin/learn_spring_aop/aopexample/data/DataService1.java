package com.mobin.learn_spring_aop.aopexample.data;

import com.mobin.learn_spring_aop.aopexample.annotations.TrackTime;
import org.springframework.stereotype.Component;

@Component
public class DataService1 {
    // suppose from db we are getting the data
    @TrackTime
    public int[] retrieveData(){
        return new int[] {11,22,33,44,55};
    }

}
