package com.inh;

abstract class Account
{
	int acno;
	String ifsc;
	double bal;
	public void deposit(double amt)
	{
		bal = bal + amt;
	}
	public double withdraw(double amt)
	{
		bal -= amt;
		return bal;
	}
	abstract double calcuateInterest(int days);
	public void addInterest(int days) {
		double d = calcuateInterest(days);
		deposit(d);
	}
}
abstract class MyDetails
{
	String userid, password;
}

class SavingAc extends Account 
{
	public void addInterest(int days)
	{
		System.out.println("logic to add interest");
	}

	@Override
	double calcuateInterest(int days) {
		// TODO Auto-generated method stub
		return 0;
	}
}
public class AbstractDemo {
	public static void main(String[] args) {
//		Account ac = new Account();
//		MyDetails det = new MyDetails();
	}

}
