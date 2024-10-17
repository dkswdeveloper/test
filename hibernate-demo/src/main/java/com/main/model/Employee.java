package com.main.model;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;

@Entity
public class Employee
{
	@SequenceGenerator(name = "empidSeq", initialValue = 101, allocationSize = 1)
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "empidSeq")
	private int empid;
	private String name;
	private Date dob;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="deptid")
	private Department dept; // by default assumption
	// foreign key name dept_deptid
	
//	@ManyToMany
//	@JoinTable(name="Project_Employee", 
//	joinColumns = {@JoinColumn(name="employees_empid")},
//	inverseJoinColumns = { @JoinColumn (name="Project_ProjId")})
//	List<Project> projects = new ArrayList<>();
	
	
	private String adhaar;
	private Integer salary;
	private String gender;
	public Employee(int empid, String name, Date dob, Department dept, String adhaar,
			Integer salary, String gender)
	{
		super();
		this.empid = empid;
		this.name = name;
		this.dob = dob;
		this.dept = dept;
		this.adhaar = adhaar;
		this.salary = salary;
		this.gender = gender;
	}
	public Employee()
	{
		super();
	}
	public int getEmpid()
	{
		return empid;
	}
	public void setEmpid(int empid)
	{
		this.empid = empid;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public Date getDob()
	{
		return dob;
	}
	public void setDob(Date dob)
	{
		this.dob = dob;
	}
	public Department getDept()
	{
		return dept;
	}
	public void setDept(Department dept)
	{
		this.dept = dept;
	}
	public String getAdhaar()
	{
		return adhaar;
	}
	public void setAdhaar(String adhaar)
	{
		this.adhaar = adhaar;
	}
	public Integer getSalary()
	{
		return salary;
	}
	public void setSalary(Integer salary)
	{
		this.salary = salary;
	}
	public String getGender()
	{
		return gender;
	}
	public void setGender(String gender)
	{
		this.gender = gender;
	}
	@Override
	public String toString()
	{
		return "Employeee [empid=" + empid + ", name=" + name + ", dob=" + dob + ", dept="
				+ dept + ", adhaar=" + adhaar + ", salary=" + salary + ", gender="
				+ gender + "]";
	}
	

}
