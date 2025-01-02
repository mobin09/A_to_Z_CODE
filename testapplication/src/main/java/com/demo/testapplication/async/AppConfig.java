package com.demo.testapplication.async;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.AsyncConfigurer;
import org.springframework.scheduling.concurrent.CustomizableThreadFactory;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import org.springframework.util.CustomizableThreadCreator;

import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;

@Configuration
public class AppConfig implements AsyncConfigurer {
    private ThreadPoolExecutor poolExecutor;
   @Override
    public synchronized Executor getAsyncExecutor(){
       if(poolExecutor == null){
           int minPoolsize = 2;
           int maxPoolSize = 4;
           int queueSize = 3;
           poolExecutor = new ThreadPoolExecutor(minPoolsize, maxPoolSize, 1,
                   TimeUnit.HOURS, new ArrayBlockingQueue<>(queueSize), new CustomThreadFactory());
       }
       return poolExecutor;
   }
}
class CustomThreadFactory implements ThreadFactory{
    private final AtomicInteger atomicInteger= new AtomicInteger(1);
    @Override
    public Thread newThread(Runnable r){
        Thread thread = new Thread(r);
        thread.setName("MyThread..-" + atomicInteger.getAndIncrement());
        return thread;
    }
}


//    @Bean(name = "myThreadPoolExecutor")
//    public Executor customThreadPoolTaskExecutor(){
//        int minPoolSize = 2;
//        int maxPoolSize  = 4;
//        int queeSize = 3;
//        ThreadPoolTaskExecutor threadPoolTaskExecutor = new ThreadPoolTaskExecutor();
//        threadPoolTaskExecutor.setCorePoolSize(minPoolSize);
//        threadPoolTaskExecutor.setMaxPoolSize(maxPoolSize);
//        threadPoolTaskExecutor.setQueueCapacity(queeSize);
//        threadPoolTaskExecutor.setThreadNamePrefix("MyThread-");
//        threadPoolTaskExecutor.initialize();
//        return threadPoolTaskExecutor;
//    }


//    @Bean(name = "myThreadExecutor")
//    public Executor taskPoolExecutor(){
//        int minPoolSize = 2;
//        int maxPoolSize  = 4;
//        int queeSize = 3;
//        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor
//                (minPoolSize, maxPoolSize, 1, TimeUnit.HOURS,
//                        new ArrayBlockingQueue<>(queeSize), new CustomThreadFactory());
//        return threadPoolExecutor;
//    }
