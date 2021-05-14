package com.example.demo.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Course;

@Repository
public class CourseDAO implements DAO<Course> {

	@Autowired
	private JdbcTemplate jdbTemplate;

	@Override
	public List<Course> list() {
		String sql = "SELECT id, description, link, name, price FROM `course`";
		return this.jdbTemplate.query(sql, new CourseMapper());
	}

	@Override
	public void create(Course t) {
		String sql = "INSERT INTO `course` (description, link, name, price) VALUES (?, ?, ?, ?)";
		this.jdbTemplate.update(sql, t.getDescription(), t.getLink(), t.getName(), t.getPrice());
		
	}

	@Override
	public Optional<Course> get(int id) {
		// TODO Auto-generated method stub
		return null;
	}


	
}
