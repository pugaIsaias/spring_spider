package com.example.demo.model;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

public class CourseList {
	
	@Autowired
	private List<Course> list;

	public List<Course> getList() {
		return list;
	}
	
	public void addCourse(Course course) {
		list.add(course);
	}
	
}
