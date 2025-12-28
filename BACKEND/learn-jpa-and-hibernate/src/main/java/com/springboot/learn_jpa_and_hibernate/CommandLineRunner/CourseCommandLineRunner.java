package com.springboot.learn_jpa_and_hibernate.CommandLineRunner;

import com.springboot.learn_jpa_and_hibernate.entity.Course;
import com.springboot.learn_jpa_and_hibernate.springjdbc.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseCommandLineRunner implements CommandLineRunner {

    @Autowired
    CourseRepository courseRepository;

    @Override
    public void run(String... args) throws Exception {
        //courseRepository.insertCourse();
       Course c =  courseRepository.getCourse(1);
       System.out.println("Author-> " + c.getAuthor() + " : name->" + c.getName());
    }
}
