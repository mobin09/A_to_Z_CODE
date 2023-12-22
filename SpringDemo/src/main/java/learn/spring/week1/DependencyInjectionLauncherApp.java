package learn.spring.week1;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class DependencyInjectionLauncherApp {
	
	   
	
      public static void main(String[] args) {
    	  try(AnnotationConfigApplicationContext context = 
    			  new AnnotationConfigApplicationContext(DependencyInjectionLauncherApp.class)){
    		  // getting all the beans from context
    		  Arrays.stream(context.getBeanDefinitionNames()).forEach(x ->{
    			  System.out.println(x);
    		  });
    		  //Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
    		  YourBusinessClass business =context.getBean(YourBusinessClass.class);
    		  StringBuffer sb= business.printDepency();
    		  System.out.println(sb);
    		  
    	  }
    	  
   
    	  
      }
}
