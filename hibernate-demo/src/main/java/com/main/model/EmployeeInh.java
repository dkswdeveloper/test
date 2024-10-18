package com.main.model;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Entity;
@Entity
@AttributeOverrides ({
		@AttributeOverride(column = @Column(name = "pid"), name="pid"),
		@AttributeOverride(column = @Column(name="name"), name="name")}
		)
public class EmployeeInh extends Person
{
	int empid;
	String designation;
	public EmployeeInh(int pid, String name, int empid, String designation)
	{
		super(pid, name);
		this.empid = empid;
		this.designation = designation;
	}
	public EmployeeInh()
	{
		super();
	}
	@Override
	public String toString()
	{
		return "EmployeeInh [empid=" + empid + ", designation=" + designation + ", pid="
				+ pid + ", name=" + name + "]";
	}
	

}
