package com.mobin.learn_spring_aop.aopexample.business;

import com.mobin.learn_spring_aop.aopexample.data.DataService1;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class BusinessService1 {
    private DataService1 dataservice1;
    public BusinessService1(DataService1 dataservice1){
        this.dataservice1 = dataservice1;
    }

    public int calculateMax() throws Exception {
       int[] data =  dataservice1.retrieveData();
       int x =  Arrays.stream(data).boxed().max(Integer::compareTo).orElse(-1);
       System.out.println("Maximum value is::" + x);
       //throw new Exception("Something went wrong");
        Thread.sleep(3000);
        return x;
    }
    // business logic
    // Data
}
