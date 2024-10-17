package basic;
//class Fig { virtual public double area() { return 0; } }
//class Rect : public Fig { 
//	public double area() { return len*wid ; } 
//}
//main()
//{
//	Figure f ;
//	Rect r;
//	f = r;
//	Figure & ref = r;
//	ref.area();
//	Figure *ptr = &r;
//	ptr -> area();
//}



public class FigureDemo {
	public static void main(String[] args) {
		Figure f= new Figure();
		Rectangle r = new Rectangle(5, 4);
		Circle c = new Circle(4);
		c.area();
		
		System.out.println(f.area());
		f = r;
		System.out.println(f.area());
		f = c;
		System.out.println(f.area());
		System.out.println(sum(f,r));
		System.out.println(sum(r,r));
		System.out.println(sum(c,r));
		System.out.println(sum(r,c));
		
		System.out.println(sum(4.5,2.3));
		System.out.println(sum(4.5,2.3, 1.1));
		Figure ar[] = new Figure[5];
		ar[0] = new Rectangle(5,4);
		ar[1] = new Circle(3);
		
		// array of object references 
	}
	public static double sum(double a, double b)
	{
		return a + b;
	}
	public static double sum(double a, double b, double c)
	{
		return a + b + c;
	}
	public static double sum(Figure a[])
	{
		return 0;
	}
	public static double sum(Figure f1, Figure f2)
	{
		return f1.area() + f2.area();
	}
}
