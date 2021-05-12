package com.example.demo.dao;

import java.util.ArrayList;

import org.springframework.stereotype.Repository;

import com.example.demo.model.Course;
import com.example.demo.model.CourseList;

@Repository
public class CourseDAO {
	
	private static CourseList list = new CourseList();

	public void addCourse(Course c) {
		list.addCourse(c);
	}
	
	public ArrayList<Course> getCourses() {
		return list.getList();
	}
}
