package com.main.dao;

import java.util.List;

import com.main.model.Student;

public interface StudentDao
{
	Student findById(int sid) throws Exception;
	List<Student> findByName(String name)  throws Exception;
	Student add(Student student)  throws Exception;
	boolean removeById(int sid)  throws Exception;
	Student update(Student student)  throws Exception;
}
