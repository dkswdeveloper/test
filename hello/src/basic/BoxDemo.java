package basic;

public class BoxDemo {
	public static void main(String[] args) {
		Box b = new Box(3,2,2);
		OpenBox ob = new OpenBox(3,2,2);
		System.out.println(b.volume());
		System.out.println(b.surfaceArea());
		System.out.println();
		System.out.println(ob.volume());
		System.out.println(ob.surfaceArea());
		
		b = ob;
		System.out.println(b.volume());
		System.out.println(b.surfaceArea());
//		ob = b;
	}
}
