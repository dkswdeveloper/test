package com.staticdemo;
class Point
{
	double x, y;
	
	static double orgx, orgy;
	
	public Point(double x, double y) {
		super();
		this.x = x;
		this.y = y;
	}
	public static void showOrigin()
	{
//		System.out.println(x  + ", "  +y );//error 
//		System.out.println(this); //error static method 
		System.out.println(orgx + "," + orgy);
	}
	public void show()
	{
		System.out.println("point " + x + "," + y);
		System.out.println(" and org " + orgx + "," + orgy);
		System.out.println(" and org " + Point.orgx + "," + orgy);
		
	}
	
}
class Point3d extends Point
{
	int z;

	public Point3d(double x, double y, int z) {
		super(x, y);
		this.z = z;
	}
	public void show()
	{
		// 2 show : super.show(), this.show()
		//overriding 
		super.show();
		System.out.println("z= " + z);
	}
	
}
public class StaticDemo {
	int value = 45;
	public static void main(String[] args) {
		StaticDemo obj = new StaticDemo();
		System.out.println(obj.value);
		Point p1 = new Point(3,4);
		p1.orgx = 10; p1.orgy = 10;
		p1.show();
		p1.showOrigin();
		
		
		Point p2 = new Point(6,7);
		p1.orgx = 20; p2.orgy = 20;
		
		System.out.println(p1.x + "," + p1.y + "," + p1.orgx + "," + p1.orgy);
		System.out.println(p2.x + "," + p2.y + "," + p2.orgx + "," + p2.orgy);
		
		// 3, 4, 10, 10
		// 6,7, 20, 20
	}

}
