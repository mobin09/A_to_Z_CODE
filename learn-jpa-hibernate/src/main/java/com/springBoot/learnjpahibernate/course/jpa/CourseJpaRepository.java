package com.springBoot.learnjpahibernate.course.jpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.springBoot.learnjpahibernate.course.Course;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

@Repository
@Transactional//whenever we want to execute query with JPA transaction should be enabled
public class CourseJpaRepository {
     @PersistenceContext  // here more specific is PersistenceContext @Autowired will also works 
	private EntityManager entityManager;  // search it from google
    
    public void insert(Course course) {
    	System.out.println("Inserted using JPA");
    	entityManager.merge(course);
    }
    
    public Course findById(long id) {
    	System.out.println("Searched using JPA");
    	return entityManager.find(Course.class, id);
    }
    
    public void deleteById(long id) {
    	System.out.println("Deleted using JPA");
    	Course course = entityManager.find(Course.class, id); // find and then delete
    	entityManager.remove(course);
    }
    
    
}
