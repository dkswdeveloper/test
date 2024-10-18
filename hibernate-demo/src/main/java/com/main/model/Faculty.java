package com.main.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("faculty")
public class Faculty extends Member
{
	Integer facid;
	String designation;
	public Faculty(int memid, String name, String email, Integer facid,
			String designation)
	{
		super(memid, name, email);
		this.facid = facid;
		this.designation = designation;
	}
	public Faculty()
	{
		super();
	}
	@Override
	public String toString()
	{
		return "Faculty [facid=" + facid + ", designation=" + designation + ", memid="
				+ memid + ", name=" + name + ", email=" + email + "]";
	}
	
}
