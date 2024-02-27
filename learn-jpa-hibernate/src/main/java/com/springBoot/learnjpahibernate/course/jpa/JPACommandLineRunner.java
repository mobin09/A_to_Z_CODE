package com.springBoot.learnjpahibernate.course.jpa;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.springBoot.learnjpahibernate.course.Course;
import com.springBoot.learnjpahibernate.course.springdatajpa.CourseSpringDataJpaRepository;

@Component
public class JPACommandLineRunner implements CommandLineRunner {

	//@Autowired
	//private CourseJpaRepository jpaRepository;

	@Autowired
	private CourseSpringDataJpaRepository repository;
	
	@Override
	public void run(String... args) throws Exception {
		System.out.println("Run Method is called");

		repository.save(new Course(1, "Full Stack java developers --> Spring Data JPA", "From iNuerons"));
		repository.save(new Course(2, "Full Stack java developers --> Spring Data JPA", "From in28Minutes"));
		repository.save(new Course(3, "Microservices in Java --> Spring Data JPA", "From in28Minutes"));
		repository.save(new Course(4, "Data Engineering --> --> Spring Data JPA", "From META"));
		repository.save(new Course(5, "DSA --> Spring Data JPA", "500 Questions"));
		repository.save(new Course(6, "AWS --> Spring Data JPA", "From in28Minutes"));
		repository.save(new Course(7, "Azure not --> Spring Data JPA", "From Microsoft"));

		repository.deleteById(7l);

		System.out.println(repository.findById(1l));
		System.out.println(repository.findById(3l));
		
		List<Course> lst = repository.findAll();
		System.out.println(lst);
		
		System.out.println(repository.count());
		
		List<Course> c1 = repository.findByName("AWS --> Spring Data JPA");
		System.out.println(c1);
		
		List<Course> c2 = repository.findByCourse("500 Questions");
		System.out.println(c2);
		

	}

}
