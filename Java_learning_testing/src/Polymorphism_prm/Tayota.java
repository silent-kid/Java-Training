package Polymorphism_prm;

public class Tayota extends Vehical
{
	void speed() 
	{
		super.speed(); 
		System.out.println("60kmps");
	}
	void color() 
	{
		super.color();
		System.out.println("black");
	}
	public static void main(String []a) 
	{
		Tayota t=new Tayota();
		t.speed();
		t.color();
	}
}
