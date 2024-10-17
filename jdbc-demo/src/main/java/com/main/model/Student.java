package com.main.model;

import java.sql.Date;

//model class, entity class
public class Student
{
	private int sid;
	private String name,branch, email, phone;
	private Date dob;
	Integer refererid;
	public Student(int sid, String name, String branch, String email, String phone,
			Date dob)
	{
		super();
		this.sid = sid;
		this.name = name;
		this.branch = branch;
		this.email = email;
		this.phone = phone;
		this.dob = dob;
	}
	public Student()
	{
		super();
	}
	public int getSid()
	{
		return sid;
	}
	public void setSid(int sid)
	{
		this.sid = sid;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public String getBranch()
	{
		return branch;
	}
	public void setBranch(String branch)
	{
		this.branch = branch;
	}
	public String getEmail()
	{
		return email;
	}
	public void setEmail(String email)
	{
		this.email = email;
	}
	public String getPhone()
	{
		return phone;
	}
	public void setPhone(String phone)
	{
		this.phone = phone;
	}
	public Date getDob()
	{
		return dob;
	}
	public void setDob(Date dob)
	{
		this.dob = dob;
	}
	@Override
	public String toString()
	{
		return "Student [sid=" + sid + ", name=" + name + ", branch=" + branch
				+ ", email=" + email + ", phone=" + phone + ", dob=" + dob + "]";
	}
	
}
