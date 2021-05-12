package com.example.demo.model;

import java.util.ArrayList;

public class CourseList {

	private ArrayList<Course> list = new ArrayList<Course>();

	public ArrayList<Course> getList() {
		return list;
	}
	
	public void addCourse(Course course) {
		list.add(course);
	}
	
}
