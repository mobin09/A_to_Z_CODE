package xmlConfigApplicationContext;

import java.util.Arrays;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import appGameUsingJava.GameRunner;

public class XmlContextLauncher {
     public static void main(String[] args) {
    	 try(ClassPathXmlApplicationContext context 
    			 = new ClassPathXmlApplicationContext("contextConfiguration.xml")){
    		 //System.out.println("Bean is defined in XMl");
    		 Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
    		 String str = (String)context.getBean("name");
    		 System.out.println("Name:"+str);
    		 
    		 Integer age = (Integer)context.getBean("age");
    		 System.out.println("Age:"+age);
    		 
    		context.getBean(GameRunner.class).run();
    		
    		 
    	 }
    	 
     }
}
