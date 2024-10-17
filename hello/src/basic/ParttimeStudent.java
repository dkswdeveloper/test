package basic;

import java.util.Arrays;

public class ParttimeStudent extends MyStudent
{
	String days[];

	public ParttimeStudent(String[] days) {
		super(); // call the super class constructor first
		this.days = days;
	}

	public ParttimeStudent(int roll, String name, String branch, String[] days) {
		super(roll, name, branch); // call the super class constructor first
		this.days = days;
	}

	public ParttimeStudent(int roll, String name, String branch, int age, String[] days) {
		super(roll, name, branch, age);
		this.days = days;
	} //alt+shift+s , O 
	public void show()
	{
		System.out.println(super.name + "," + super.roll + ", " + this.age 
				+ Arrays.toString(this.days)); 
	}

}
