package com.main.model;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="type", discriminatorType = DiscriminatorType.STRING)
public class Member
{
	@Id
	@GeneratedValue
	int memid;
	
	String name;
	String email;
	@Override
	public String toString()
	{
		return "Member [memid=" + memid + ", name=" + name + ", email=" + email + "]";
	}
	public Member(int memid, String name, String email)
	{
		super();
		this.memid = memid;
		this.name = name;
		this.email = email;
	}
	public Member()
	{
		super();
	}
	
	

}
