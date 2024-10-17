package com.main.service;

import java.util.List;

import com.main.model.Student;

public interface StudentService
{
	Student findById(int sid) throws Exception;
	List<Student> findByName(String name)  throws Exception;
	Student add(Student student)  throws Exception;
	boolean removeById(int sid)  throws Exception;
	Student update(Student student)  throws Exception;
	public boolean issueNoDues(Student student) throws Exception;

}
