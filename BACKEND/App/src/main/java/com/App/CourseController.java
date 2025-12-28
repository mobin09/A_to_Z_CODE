package com.App;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {
   
	@RequestMapping("/course")
	public List<Course> getCourses(){
		return Arrays.asList(
				new Course(1, "Full Stack Development", "in28Minutes"),
				new Course(2, "Microservices with Spring Boot", "in28Minutes"),
				new Course(3, "Learn AWS", "in28Minutes"),
				new Course(4, "Learn React", "React Documentation"),
				new Course(5, "Learn DSA", "GFG and LeetCode")
				);
	}
}
