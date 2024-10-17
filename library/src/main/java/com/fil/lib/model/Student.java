package com.fil.lib.model;

public class Student
{
	static int nextRoll = 201;
	int roll;
	String name;
	int numBooks = 0;
	public Student(String name)
	{
		super();
		this.name = name;
	}
	public Student()
	{
		super();
	}
	public static int getNextRoll()
	{
		return nextRoll;
	}
	public static void setNextRoll(int nextRoll)
	{
		Student.nextRoll = nextRoll;
	}
	public int getRoll()
	{
		return roll;
	}
	public void setRoll(int roll)
	{
		this.roll = roll;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public int getNumBooks()
	{
		return numBooks;
	}
	public void setNumBooks(int numBooks)
	{
		this.numBooks = numBooks;
	}
	@Override
	public String toString()
	{
		return "Student [roll=" + roll + ", name=" + name + ", numBooks=" + numBooks
				+ "]";
	}
	

}
