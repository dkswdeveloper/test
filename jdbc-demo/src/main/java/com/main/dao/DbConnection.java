package com.main.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.mysql.cj.jdbc.MysqlDataSource;

public class DbConnection
{
	// SINGLETON : 
	private static Connection connection = null;
	private DbConnection() throws SQLException
	{
//		Class.forName("Driver");
//		DriverManager.getConnection(url, user, pass); //older method
		MysqlDataSource dataSource  = new MysqlDataSource();
		dataSource.setUser("root");
		dataSource.setPassword("password");
		dataSource.setUrl("jdbc:mysql://localhost:3306/fil24");
		//initialize static connection
		connection = dataSource.getConnection();
	}
	public static Connection getConnection() throws SQLException //Factory Method
	{
		if(connection != null && !connection.isClosed())
		{
			// do nothing
			return connection;
		}
		new DbConnection();
		return connection; 
	}
	

}
