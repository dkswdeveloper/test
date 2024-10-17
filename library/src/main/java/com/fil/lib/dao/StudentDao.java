package com.fil.lib.dao;

import java.util.List;

import com.fil.lib.model.Student;

//connects to db and gets the data of student, converts data to object
// to save object, gets data from object & saves to db
public interface StudentDao
{
	public Student findById(int roll);
	public List<Student> findByName(String name); //by default public
	public boolean removeById(int roll);
	public Student update(Student student);
	Student add(Student student);
}
