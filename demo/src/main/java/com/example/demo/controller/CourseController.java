package com.example.demo.controller;

import java.util.List;

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
		this.dao.create(c);
		return c;
	}
	
	@GetMapping("/course")
	public List<Course> getCourses(){
		return this.dao.list();
	}
	
}
