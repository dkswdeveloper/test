package basic;

public class Box {
	double len,wid, ht;

	public Box(double len, double wid, double ht) {
		this.len = len;
		this.wid = wid;
		this.ht = ht;
	}
	public double volume()
	{
		return len * wid * ht; // alt shift s, O
	}
	public double surfaceArea()
	{
		return 2*(len*wid + wid * ht + ht * len);
	}

}
