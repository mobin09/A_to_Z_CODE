package com.demo.testapplication.async;


import org.springframework.scheduling.annotation.Async;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class Demo {
   @Async
    public static void m1(){
       for(int i=0; i<1000000; i++){
           System.out.println("First Report Async" + i);
       }
   }


    public static void m2(){
        for(int i=0; i<100000000; i++){
            System.out.println("Second Report Async" + i);
        }
    }

    @Async
    public static void m3(){
        for(int i=0; i<1000000; i++){
            System.out.println("Third Report Async" + i);
        }
    }

    @Async
    public static void m4(){
        for(int i=0; i<1000000; i++){
            System.out.println("Fourth Report Async" + i);
        }
    }

    @Async
    public static void m5(){
        for(int i=0; i<1000000; i++){
            System.out.println("Fifth Report Async" + i);
        }
    }

    @GetMapping("/check")
    public String  run(){
       m1();
       m2();
       m3();
       m4();
       m5();

       return "DOne";

    }


}




