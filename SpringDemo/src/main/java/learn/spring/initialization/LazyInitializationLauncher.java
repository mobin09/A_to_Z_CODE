package learn.spring.initialization;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
class ClassA{
	
}
// ClassB initialized automatically
@Component
@Lazy //if we put the Lazy then it will not initialized automatically.
// If we call that bean then it will initialized
//Indicates whether a bean is to be lazily initialized.
//If this annotation is not present on a @Component or @Bean definition, eager initialization will occur. 
class ClassB{
	private ClassA classA;
	
	@Autowired
	public ClassB(ClassA classA) {
		// logic 
		System.out.println("Initialization");
		this.classA = classA;
	}
	
}



@Configuration
@ComponentScan
public class LazyInitializationLauncher {
	public static void main(String[] args) {
		try(AnnotationConfigApplicationContext 
				context = new AnnotationConfigApplicationContext(LazyInitializationLauncher.class)){
			// we are not loading any bean.
			// we are not calling any methods
			// initialization of bean automatically happened
			context.getBean(ClassB.class);
			
		}
		
	}
}
