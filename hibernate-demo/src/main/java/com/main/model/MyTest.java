package com.main.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="test")
public class MyTest
{
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	private int testid;
	private String name;
	public MyTest(int testid, String name)
	{
		super();
		this.testid = testid;
		this.name = name;
	}
	public MyTest()
	{
		super();
	}
	public int getTestid()
	{
		return testid;
	}
	public void setTestid(int testid)
	{
		this.testid = testid;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	@Override
	public String toString()
	{
		return "MyTest [testid=" + testid + ", name=" + name + "]";
	}
	

}
