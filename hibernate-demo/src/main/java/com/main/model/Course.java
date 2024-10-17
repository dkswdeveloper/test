package com.main.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Course
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) //auto increment by DB
	private int cid;
	private String cname;
	private Integer cost;
	private Integer duration;
	
	public Course()
	{
		super();
	}
	public Course(int cid, String cname, Integer cost, Integer duration)
	{
		super();
		this.cid = cid;
		this.cname = cname;
		this.cost = cost;
		this.duration = duration;
	}
	@Override
	public String toString()
	{
		return "Course [cid=" + cid + ", cname=" + cname + ", cost=" + cost
				+ ", duration=" + duration + "]";
	}
	public int getCid()
	{
		return cid;
	}
	public void setCid(int cid)
	{
		this.cid = cid;
	}
	public String getCname()
	{
		return cname;
	}
	public void setCname(String cname)
	{
		this.cname = cname;
	}
	public Integer getCost()
	{
		return cost;
	}
	public void setCost(Integer cost)
	{
		this.cost = cost;
	}
	public Integer getDuration()
	{
		return duration;
	}
	public void setDuration(Integer duration)
	{
		this.duration = duration;
	}
	

}
