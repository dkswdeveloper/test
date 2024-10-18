package com.main.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value = "student")
public class LibStudent extends Member
{
	Integer roll;
	String branch;
	
	public LibStudent(int memid, String name, String email, Integer roll, String branch)
	{
		super(memid, name, email);
		this.roll = roll;
		this.branch = branch;
	}
	public LibStudent()
	{
		super();
	}
	@Override
	public String toString()
	{
		return "LibStudent [roll=" + roll + ", branch=" + branch + ", memid=" + memid
				+ ", name=" + name + ", email=" + email + "]";
	}
	
}
