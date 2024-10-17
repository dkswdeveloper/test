package com.main;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.main.dao.StudentDao;
import com.main.dao.StudentDaoImpl;
import com.main.model.Student;
import com.main.service.StudentService;
import com.main.service.StudentServiceImpl;

public class MainJdbc {

	public static void main(String[] args) throws Exception {
		StudentDao studentDao = new StudentDaoImpl();
		Student student = studentDao.findById(101);
		System.out.println(student);
//		Student added = studentDao.add(new Student(113,"Aruna", "ECE", "aruna@gmail.com","8765988754",
//				Date.valueOf("2002-04-05")));
		StudentService service = new StudentServiceImpl(studentDao);
		Student added = service.add(new Student(114,"Aruna", "ECE", "aruna@gmail.com","8765988754",
				Date.valueOf("2001-04-15")));
		System.out.println(added);
		
		
		
	}
	public static void testJdbc() throws SQLException
	{
		Connection connection = null;
		Statement statement = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/fil24","root", "password");
			statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery("select * from employee");
			while(resultSet.next())
			{
				int empid = resultSet.getInt("empid");
				String name = resultSet.getString("name");
				System.out.println(empid + ":" + name);
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally
		{
			statement.close();
			connection.close();
		}
	}

}
