package appUsingSpringBasic;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class HelloWorldSpring {
	public static void main(String[] args) {
		// Launch a Spring Context
	    AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);
	 // Configure the things that we want Spring to manage: 
	 //   HelloWorldConfiguration : @Configuration
	 //   name : @Bean
	    
	 //Retrieving Beans manage by Spring   
	 //context.getBean("name_of_bean") return the object   
	   String name = (String)context.getBean("name");
	   int age =  (int)context.getBean("age");
	   System.out.println(name);
	   System.out.println(age);

	   Person p = (Person)context.getBean("person");
	   System.out.println("Person name is:"+ p.getName());
	   System.out.println("Person age is:" + p.getAge());
	   
	   Address add = (Address)context.getBean("addr");
	   String address = add.getColony() +" , " + add.getCity() + " , " + add.getState();
	   System.out.println(address);
	   
	   Student st =  context.getBean(Student.class);
	   System.out.println(st.getName());
	   System.out.println(st.getSudyIn());
	   System.out.println("***************************************");
	  // System.out.println("Bean defination"+context.getBeanDefinition(name));
	   String[] beanNames = context.getBeanDefinitionNames();
	   int count = context.getBeanDefinitionCount();
	   System.out.println(count);
	  //System.out.println(Arrays.toString(beanNames));
	   System.out.println("----------------------------------------------");
//	   for(String s : beanNames) {
//		   System.out.println(s);
//	   }
	   
	   Arrays.stream(beanNames).forEach(System.out::println);
	   
	   Person p1 = (Person)context.getBean(Person.class);
	   Student st2 = (Student)context.getBean(Student.class);
	   
	   Laptop lap= context.getBean(Laptop.class);
	   String st3 = lap.getConfig().getGeneration();
	   System.out.println(st3);
	}
}
