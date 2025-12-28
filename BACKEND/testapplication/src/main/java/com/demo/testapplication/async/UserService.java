package com.demo.testapplication.async;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
public class UserService {
    @Async
   public void asyncMethodTest(){
        try{
            System.out.println("Inside asyncMethodTest:: " + Thread.currentThread().getName());
            //Thread.sleep(5000);
        } catch (Exception e) {

        }
    }
}
