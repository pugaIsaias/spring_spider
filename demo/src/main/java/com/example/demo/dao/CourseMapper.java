package com.example.demo.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.example.demo.model.Course;

public class CourseMapper implements RowMapper<Course> {

	@Override
	public Course mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		Course course = new Course();
		course.setId(rs.getInt("id"));
		course.setBanner(rs.getString("banner"));
		course.setDescription(rs.getString("description"));
		course.setLink(rs.getString("link"));
		course.setName(rs.getString("name"));
		course.setPrice(rs.getBigDecimal("price"));
		return course;
	}

}
