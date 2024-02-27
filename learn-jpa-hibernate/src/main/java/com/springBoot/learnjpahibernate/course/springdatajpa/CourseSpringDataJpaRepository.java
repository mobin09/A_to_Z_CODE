package com.springBoot.learnjpahibernate.course.springdatajpa;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springBoot.learnjpahibernate.course.Course;

public interface CourseSpringDataJpaRepository extends JpaRepository<Course, Long>{
   public List<Course> findByName(String name); // custom method no need for implementation
   //findBy --> fixed then name is the attribute then it will be findByName() 
   //e.g
   public List<Course> findByCourse(String course);
}
