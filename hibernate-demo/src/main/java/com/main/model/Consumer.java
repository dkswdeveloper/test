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

public class Consumer extends Person
{
	String address;
	Double ranking;
	public Consumer(int pid, String name, String address, Double ranking)
	{
		super(pid, name);
		this.address = address;
		this.ranking = ranking;
	}
	public Consumer(int pid, String name)
	{
		super(pid, name);
	}
	
	public Consumer()
	{
		super();
	}
	@Override
	public String toString()
	{
		return "Consumer [address=" + address + ", ranking=" + ranking + ", pid=" + pid
				+ ", name=" + name + "]";
	}
	
	

}
