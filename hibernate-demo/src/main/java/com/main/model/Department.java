package com.main.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Department
{
	@Id
	private String deptid;
	private String location;
	
//	@OneToMany(mappedBy = "dept", fetch = FetchType.EAGER)
	@OneToMany(mappedBy = "dept", fetch = FetchType.LAZY)
	private List<Employee> employees = new ArrayList<>();
	
	
	public List<Employee> getEmployees()
	{
		return employees;
	}
	public void setEmployees(List<Employee> employees)
	{
		this.employees = employees;
	}
	public Department(String deptid, String location)
	{
		super();
		this.deptid = deptid;
		this.location = location;
	}
	public Department()
	{
		super();
	}
	public String getDeptid()
	{
		return deptid;
	}
	public void setDeptid(String deptid)
	{
		this.deptid = deptid;
	}
	public String getLocation()
	{
		return location;
	}
	public void setLocation(String location)
	{
		this.location = location;
	}
	@Override
	public String toString()
	{
		return "Department [deptid=" + deptid + ", location=" + location + "]";
	}
	
	

}
