package com.learnspring.SpringDemo.HelloWorldSpring;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class HelloWorld {
      public static void main(String[] args) {
    	  AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(HelloWorldConfiguration12.class);
    	  int x = context.getBeanDefinitionCount();
    	  System.out.println("Number of bean is::" + x);
    	  String[] list = context.getBeanDefinitionNames();
    	  Arrays.stream(list).forEach(System.out::println);
    	  
    	 String name =  (String) context.getBean("getName");
    	 System.out.println(name);
    	 
    	 Integer age = (Integer)context.getBean("getAge");
    	 System.out.println(age);
    	 
    	Person p1 =  context.getBean(Person.class);
    	String fname = p1.getFirstName();
    	String lname = p1.getLastName();
    	System.out.println("Person first name is::" + fname + ", Person last name is the:::" + lname);
    	 
      }
}
