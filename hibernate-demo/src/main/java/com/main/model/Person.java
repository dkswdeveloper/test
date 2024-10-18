package com.main.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Person
{
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	int pid;
	String name;
	@Override
	public String toString()
	{
		return "Person [pid=" + pid + ", name=" + name + "]";
	}
	public Person(int pid, String name)
	{
		super();
		this.pid = pid;
		this.name = name;
	}
	public Person()
	{
		super();
	}
	
}





