package Abstraction;

import java.util.Scanner;

public class PartTimeemp extends Employee
{
	static int day;
	final int price=250;
	int sal;
	
	void calculatesal() 
	{
		
		 sal=day*price;
		System.out.println("you have worked"+day+"days");
		System.out.println("your earned sal is "+sal);
		
	}

	@Override
	void bonus() 
	{
		if(day>25)
		{
			int bon=sal+1000;
			System.out.println("congrats you have got bonus of "+bon);
		}
		
		
	}
	public static void main(String []a)
	{
		PartTimeemp ft=new PartTimeemp();
		Scanner sc=new Scanner(System.in);
		System.out.println("entre homany days you worked");
		day=sc.nextInt();
		
		ft.calculatesal();
		ft.bonus();
		sc.close();
	}
	
}
