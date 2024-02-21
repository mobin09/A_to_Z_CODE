package com.springBoot.learnjpahibernate.course.jpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.springBoot.learnjpahibernate.course.Course;

@Component
public class JPACommandLineRunner implements CommandLineRunner {

	@Autowired
	private CourseJpaRepository jpaRepository;

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Run Method is called");

		jpaRepository.insert(new Course(1, "Full Stack java developers now", "From iNuerons"));
		jpaRepository.insert(new Course(2, "Full Stack java developers now", "From in28Minutes"));
		jpaRepository.insert(new Course(3, "Microservices in Java now", "From in28Minutes"));
		jpaRepository.insert(new Course(4, "Data Engineering now", "From META"));
		jpaRepository.insert(new Course(5, "DSA now", "500 Questions"));
		jpaRepository.insert(new Course(6, "AWS now", "From in28Minutes"));
		jpaRepository.insert(new Course(7, "Azure not", "From Microsoft"));

		jpaRepository.deleteById(7);

		System.out.println(jpaRepository.findById(1));
		System.out.println(jpaRepository.findById(3));

	}

}
