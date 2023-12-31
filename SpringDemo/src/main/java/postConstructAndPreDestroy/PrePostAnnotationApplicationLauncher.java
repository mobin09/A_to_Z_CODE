package postConstructAndPreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

import java.util.Arrays;

@Component
class SomeClass {
	private SomeDependency someDependency;

	@Autowired
	public SomeClass(SomeDependency someDependency) {
		this.someDependency = someDependency;
		System.out.println("Bean initialized");
	}

	@PostConstruct
	public void doSomeThing() {
		someDependency.getReady();
	}
	
	@PreDestroy
	public void cleanUp() {
		System.out.println("Clean Up activities");
	}
	

}

@Component
class SomeDependency {

	public void getReady() {
		System.out.println("We are ready");

	}

}

@ComponentScan
@Configuration
public class PrePostAnnotationApplicationLauncher {
	public static void main(String[] args) {
		try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
				PrePostAnnotationApplicationLauncher.class)) {
			//Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
			
		//SomeClass someClass = context.getBean(SomeClass.class);
		//someClass.doSomeThing();
			

		}
	}
}
