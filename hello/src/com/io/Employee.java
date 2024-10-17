package com.io;

import java.io.Serializable;
//Marker interface : interface with no methods

public class Employee implements Serializable{
	private static final long serialVersionUID = 1L;
	int empid;
	String name;
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", name=" + name + "]";
	}
	public Employee(int empid, String name) {
		super();
		this.empid = empid;
		this.name = name;
	}
	
}
