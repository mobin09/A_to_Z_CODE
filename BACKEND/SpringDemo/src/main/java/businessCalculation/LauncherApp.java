package businessCalculation;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class LauncherApp {
    public static void main(String[] args) {
    	try(AnnotationConfigApplicationContext context = 
    			new AnnotationConfigApplicationContext(LauncherApp.class)){
    		   BusinessCalculationService blogic = context.getBean(BusinessCalculationService.class);
    		  
    		   int x =  blogic.findMax();
    		   System.out.println(x);
    	}
    }
}
