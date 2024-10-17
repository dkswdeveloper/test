package com.main.service;

import java.sql.Connection;
import java.sql.Savepoint;
import java.util.List;

import com.main.dao.DbConnection;
import com.main.dao.StudentDao;
import com.main.model.Student;

public class StudentServiceImpl implements StudentService
{
	StudentDao studentDao;
	public StudentServiceImpl(StudentDao studentDao)
	{
		super();
		this.studentDao = studentDao;
	}
	@Override
	public Student add(Student student) throws Exception
	{
		Connection connection = DbConnection.getConnection();
		boolean autoCommit = connection.getAutoCommit();
		if(autoCommit)
		{
			connection.setAutoCommit(false);
		}
		Savepoint savepoint = connection.setSavepoint();
		try
		{
			// execute on multiple StudentDao, CourseDao, RegistrationDao
			// LOGIC  of application will be here
			Student add = studentDao.add(student);
			connection.commit();
			return add;
		}
		catch(Exception e)
		{
			connection.rollback(savepoint);
		}
		
		return null;
	}
	@Override
	public Student findById(int sid) throws Exception
	{
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List<Student> findByName(String name) throws Exception
	{
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public boolean removeById(int sid) throws Exception
	{
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Student update(Student student) throws Exception
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean issueNoDues(Student student) throws Exception
	{
		// TODO Auto-generated method stub
		return false;
	}

}
