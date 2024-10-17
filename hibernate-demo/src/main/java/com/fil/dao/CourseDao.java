package com.fil.dao;

import com.main.model.Course;

import java.util.List;

public interface CourseDao
{
	Course findById(int cid);
	List<Course> findAll();
	Course save(Course course);
}
