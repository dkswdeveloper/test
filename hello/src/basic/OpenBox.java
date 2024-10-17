package basic;

public class OpenBox extends Box{

	public OpenBox(double len, double wid, double ht) {
		super(len, wid, ht);
	}
	public double surfaceArea()
	{
		return len * wid + 2*(wid * ht + ht * len);
	}
}
