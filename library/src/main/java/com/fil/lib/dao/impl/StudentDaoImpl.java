package com.fil.lib.dao.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.fil.lib.dao.StudentDao;
import com.fil.lib.model.Student;

public class StudentDaoImpl implements StudentDao
{
	private static Map<Integer, Student> map = new HashMap<>();
	//static block
	static
	{
		Student b1 = new Student("Mohit");
		Student b2 = new Student("Sumit");
		Student b3 = new Student("Sachin");
		Student b4 = new Student("Ankita");
		Student b5 = new Student("Aruna");
		Student b6 = new Student("Anisha");
		List<Student> list = List.of(b1,b2,b3,b4,b5,b6);
		list.stream().forEach(st -> map.put(st.getRoll(),st));
	}
	@Override
	public Student findById(int roll)
	{
		return map.get(roll);
	}
	@Override
	public List<Student> findByName(String name)
	{
		return map.values().stream()
				.filter(bk -> bk.getName().equals(name))
				.collect(Collectors.toList());
	}
	
	@Override
	public boolean removeById(int roll)
	{
		if(map.containsKey(roll))
		{
			map.remove(roll);
			return true;
		}
		return false;
	}

	@Override
	public Student update(Student student)
	{
		if(map.containsKey(student.getRoll()))
		{
			map.put(student.getRoll(), student);
			return student;
		}
		return null;
	}

	@Override
	public Student add(Student student)
	{
		if(!map.containsKey(student.getRoll()))
		{
			map.put(student.getRoll(), student);
			return student;
		}
		return null;
	}

}
