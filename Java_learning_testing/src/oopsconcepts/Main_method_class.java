package oopsconcepts;

class Singers
{
	String s1="ketty peri";
	String s2="bob marley";
	String s3="justin";
	void concert() 
	{
		System.out.println("welcome to the "+s1+" concert");
		System.out.println("welcome to the "+s2+" concert");
		System.out.println("welcome to the "+s3+" concert");
	}
}

class date extends Singers
{
	String d1="10/01/2026";
	int price=1000;
	void priceing() 
	{
		date D=new date();
		System.out.println("for "+D.s1+" Show date is "+d1+" and price is "+price);
		System.out.println("for "+D.s2+" Show date is "+d1+" and price is "+price);
		System.out.println("for "+D.s3+" Show date is "+d1+" and price is "+price);
	}
}

public class Main_method_class {

	public static void main(String[] args) {
		
		new date().concert();
		new date().priceing();

	}

}
