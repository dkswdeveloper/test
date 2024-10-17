package com.main.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.main.model.Student;

public class StudentDaoImpl implements StudentDao
{
	@Override
	public Student findById(int sid) throws Exception
	{
		Connection connection = DbConnection.getConnection();
		PreparedStatement preparedStatement = connection.prepareStatement("select * from student where sid = ?");
		preparedStatement.setInt(1, sid); //1 : 1st ?
		ResultSet resultSet = preparedStatement.executeQuery();
		if(resultSet.next())
		{
			//get data , put in student object and return
			Student student = getStudent(resultSet);
			return student;
		}
		else
		{
			throw new Exception("Student with sid =" + sid + " not found");
		}
	}

	private Student getStudent(ResultSet resultSet) throws SQLException
	{
		resultSet.getInt(1); // column number 
		int sid = resultSet.getInt("sid");
		String name = resultSet.getString("name");
		String email = resultSet.getString("email");
		String phone = resultSet.getString("phone");
		String branch = resultSet.getString("branch");
		Date dob = resultSet.getDate("dob");
		Student student = new Student(sid, name, branch,email, phone,dob);
		return student;
	}

	@Override
	public List<Student> findByName(String name)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Student add(Student student)  throws Exception
	{
		Connection connection = DbConnection.getConnection();
		String sql = "insert into student(sid,name,phone,email,branch, dob) "
				+ "values (?,?,?,?,?,?)";
		PreparedStatement preparedStatement = connection.prepareStatement(sql);
		preparedStatement.setInt(1, student.getSid());
		preparedStatement.setString(2, student.getName());
		preparedStatement.setString(3, student.getPhone());
		preparedStatement.setString(4, student.getEmail());
		preparedStatement.setString(5, student.getBranch());
		preparedStatement.setDate(6, student.getDob());
		int rowsUpdated = preparedStatement.executeUpdate();
		if(rowsUpdated == 1)
		{
			return student;
		}
		
		return null;
	}

	@Override
	public boolean removeById(int sid)
	{
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Student update(Student student)
	{
		// TODO Auto-generated method stub
		return null;
	}

}
