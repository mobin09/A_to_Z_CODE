package com.springBoot.learnjpahibernate.course;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity(name = "table_name")
public class Course {
    @Id
	private long id;
    
    private String name;
    private String course;
    
    
    
	public Course() {
		super();
	}
	public Course(long id, String name, String course) {
		super();
		this.id = id;
		this.name = name;
		this.course = course;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	
	@Override
	public String toString() {
		return "Course [id=" + id + ", name=" + name + ", author=" + course + "]";
	}
    
    
}
