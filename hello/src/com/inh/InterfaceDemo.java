package com.inh;

interface Figure {
	public double area();
	public void draw();
}
class Rect implements Figure
{
	double len, wid;
	public Rect(double len, double wid) {
		super();
		this.len = len;
		this.wid = wid;
	}
	public double area()
	{
		return len * wid;
	}
	@Override
	public void draw() {
		System.out.println("rectangle drawn");
	}
}
public class InterfaceDemo
{
	public static void main(String[] args) {
		Account ref ;
		ref = new SavingAc();
//		Figure fig = new Figure(); //can not create object of interface
		Figure fig; // declare reference
		fig = new Rect(6,5);
		double area = fig.area();
		System.out.println(area);
	}
	public double sum(Figure[] figures)
	{
		double s = 0;
		for(Figure f : figures)
		{
			s += f.area();
		}
		return s;
	}
}





