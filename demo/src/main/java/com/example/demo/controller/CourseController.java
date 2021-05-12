package com.example.demo.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.CourseDAO;
import com.example.demo.model.Course;

@RestController
public class CourseController {

	@Autowired
	private CourseDAO dao;
	
	@PostMapping("/course")
	public Course addCourse(@RequestBody Course c) {
		System.out.println(c);
		this.dao.addCourse(c);
		return c;
	}
	
	@GetMapping("/course")
	public ArrayList<Course> getCourses(){
		return this.dao.getCourses();
	}
}
