package basic;
class MyStudent 
{
	int roll;
	String name;
	String branch;
	int age;
	
	{
		System.out.println("this is anonymous constructor");
		System.out.println("it is part of every constructor ");
	}
	
	public MyStudent() { 
		System.out.println("default constructor : does nothing");
	} //default constructor : no args
	public MyStudent(int roll, String name, String branch)
	{
		System.out.println("parameterized constructor");
		this.roll = roll;
		this.name = name;
		this.branch = branch;
	}
	
	public MyStudent(int roll, String name, String branch, int age) {
		super();
		System.out.println("parameterized constructor 2");
		this.roll = roll;
		this.name = name;
		this.branch = branch;
		this.age = age;
	}
	public void show()
	{
		System.out.println("Student with roll="+roll  + " and name = " + name 
				+ ", from branch = " + branch);
	}
	public MyStudent older(MyStudent s2) {
		//there are 2 students : this, s2
		if(this.age > s2.age)return this;
		else return s2;
	}
}
