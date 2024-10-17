package com.staticdemo;

import java.io.File;
import java.util.Scanner;

public class Student {

	private int roll;
	private String name, branch;
	private static int nextRoll=101;
	static	{ //static block to initialize static data
		System.out.println("nextRoll=" + nextRoll);
		System.out.println("static block called: trying to initialize nextRoll");
		try
		{
			//file from pwd : project directory
			File f = new File("initStudentRoll.txt"); //in curret folder pwd
			Scanner sc = new Scanner(f);
			nextRoll = sc.nextInt();
		}
		catch(Exception e)
		{
			System.out.println(e);
			System.out.println("nextRoll initialized with 1");
			nextRoll = 1;
		}
	}
	

	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", branch=" + branch + "]";
	}
	public Student(String name, String branch) {
		super();
		this.roll = nextRoll;
		nextRoll++;
		this.name = name;
		this.branch = branch;
	}
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public static void main(String[] args) {
		// static block has already executed
		Student s1 = new Student( "Ankita", "CSE");
		Student s2 = new Student("Taruna", "CSE");
		Student s3 = new Student("Taruna", "CSE");
		Student s4 = new Student("Taruna", "CSE");
		Student s5 = new Student("Taruna", "CSE");
		Student s6 = new Student("Taruna", "CSE");
		Student s7 = new Student("Taruna", "CSE");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		System.out.println(s5);
		System.out.println(s6);
		System.out.println(s7);

	}


}
