package com.inh;

import java.util.Arrays;
import java.util.Comparator;
interface Calc
{
	int add(int a, int b);
}
class MyCalc implements Calc
{
	String name = "Harshit";
	@Override
	public int add(int a, int b) {
		return a + b;
	}
}
class Employee  extends Object implements Comparable<Employee>
{
	int empid;
	String name;
	int depid;
	int age;
	public Employee(int empid, String name, int depid, int age) {
		super();
		this.empid = empid;
		this.name = name;
		this.depid = depid;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", name=" + name + ", depid=" + depid + ", age=" + age + "]";
	}
	@Override
	public int compareTo(Employee o) {
		//this > o return +ve
		// this < o return -ve
		// this == o return 0
		//		if(this.empid > o.empid) return 1;
		//		if(this.empid < o.empid) return -1;
		//		return 0;
		return this.empid - o.empid;
	}
}
class EmployeeAgeComparator implements Comparator<Employee>
{
	@Override
	public int compare(Employee o1, Employee o2) {
		return o1.age - o2.age;
	}
}
class EmployeeDepComparator implements Comparator<Employee>
{
	@Override
	public int compare(Employee o1, Employee o2) {
		return o1.depid - o2.depid;
	}
}
public class SortDemo {
	public static void main(String[] args) 
	{
		Employee e1 = new Employee(12, "A", 3, 34);
		Employee e2 = new Employee(11, "E", 4, 29);
		Employee e3 = new Employee(13, "D", 3, 31);
		Employee e4 = new Employee(14, "C", 1, 35);
		Employee e5 = new Employee(17, "B", 7, 24);
		Employee[] ar = new Employee[5];
		//are these employee comparable ? 
		ar[0] = e1;
		ar[1] = e2;
		ar[2] = e3;
		ar[3] = e4;
		ar[4] = e5;

		Arrays.sort(ar);
		EmployeeAgeComparator employeeAgeComparator = new EmployeeAgeComparator();

		Arrays.sort(ar, employeeAgeComparator);
		System.out.println(Arrays.toString(ar));
		//		Arrays.sort(ar, )
		
		Calc cal1  = new MyCalc();
		MyCalc someObj = (MyCalc) cal1;
		//Object of anonymous class
		Calc cal2 = new Calc() { 
			public int add(int a, int b) {
				System.out.println(this.getClass());
				return a + b;
			}
		};
		cal2.add(4, 5);
		// Functional Interface : An interface with only 1 abstract method
		Calc cal4 = (a,b) -> { return a + b ; } ; //lambda expression
		Calc cal5 = (a,b) -> a +b ; //lambda expression return an object of functional interface
		
		Comparator<String> cmpStr = (o1, o2) -> o1.length() - o2.length(); 
		String[] strAr = {"sdlkfj", "elkj", "lkwe", "lkkn"};
		Arrays.sort(strAr, cmpStr );
		Arrays.sort(strAr, (s1,s2) -> s1.length() - s2.length() );
		Arrays.sort(ar, (em1, em2) -> em1.empid - em2.empid);
		
		String str = "Hello";
		
		Object ob = new String("hello");
		
		int hashCode = ob.hashCode();
		Class class1 = ob.getClass();
		System.out.println(class1);
		String string = ob.toString();
		System.out.println(e1); // it calls e1.toString()
		
		
		
		
		
		
		


	}

}
