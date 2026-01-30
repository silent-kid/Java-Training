package Encapsulation;

import java.util.Scanner;

public class Display extends Bank
{
	public static void main(String []a) 
	{
		Scanner sc=new Scanner(System.in);
		Display d=new Display();
		d.setBalance(1000);
		System.out.println("plz enter password");
		d.pass=sc.nextLine();
		System.out.println(d.getBalance());
		
	}
}
