package com.main.model;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumns;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Project
{
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int projId;
	
	private String title;
	private String client;
	private Date startDate, endDate;
	
	//assumptions : table : project_employee, 2 FK : project_projId, employee_empid
	@ManyToMany(cascade = CascadeType.ALL)
	private List<Employee> employees = new ArrayList<>();
	
	public List<Employee> getEmployees()
	{
		return employees;
	}
	public void setEmployees(List<Employee> employees)
	{
		this.employees = employees;
	}
	public Project(int projId, String title, String client, Date startDate, Date endDate)
	{
		super();
		this.projId = projId;
		this.title = title;
		this.client = client;
		this.startDate = startDate;
		this.endDate = endDate;
	}
	public Project()
	{
		super();
	}
	public int getProjId()
	{
		return projId;
	}
	public void setProjId(int projId)
	{
		this.projId = projId;
	}
	public String getTitle()
	{
		return title;
	}
	public void setTitle(String title)
	{
		this.title = title;
	}
	public String getClient()
	{
		return client;
	}
	public void setClient(String client)
	{
		this.client = client;
	}
	public Date getStartDate()
	{
		return startDate;
	}
	public void setStartDate(Date startDate)
	{
		this.startDate = startDate;
	}
	public Date getEndDate()
	{
		return endDate;
	}
	public void setEndDate(Date endDate)
	{
		this.endDate = endDate;
	}
	@Override
	public String toString()
	{
		return "Project [projId=" + projId + ", title=" + title + ", client=" + client
				+ ", startDate=" + startDate + ", endDate=" + endDate + "]";
	}
	

}
