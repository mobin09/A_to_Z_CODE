package cdiAnnotation;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import jakarta.inject.Inject;
import jakarta.inject.Named;


//@Component
@Named
class BusinessService{
	private DataService dataService;
	
	public DataService getDataService() {
		return dataService;
	}
	//@Autowired
	@Inject
	public void setDataService(DataService dataService) {
		this.dataService = dataService;
		System.out.println("Setter Injection Performed");
	}
	
}

//@Component
@Named
class DataService{
	
}


@Configuration
@ComponentScan
public class CDILauncherApp {
    public static void main(String[] args) {
    	
    	try( AnnotationConfigApplicationContext context  
    			= new AnnotationConfigApplicationContext(CDILauncherApp.class)){
    	         Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);	
    	         BusinessService bs = context.getBean(BusinessService.class);
    	         DataService ds = bs.getDataService();
    	         System.out.println(ds);
    	         
    	}
       
    }
}
