package Handeling;

import java.util.Scanner;

public class TryCatchFinally 
{
	Scanner sc=new Scanner(System.in);
	void read() 
	{
		System.out.println("plz inter a number");
		int a = sc.nextInt();
		System.out.println("plz inter b number");
		int b = sc.nextInt();
		try {
			int c=a/b;
			System.out.println("your ans is "+c);
		}
		catch(Exception e) 
		{
			System.out.println(e);
		}
		finally {
			sc.close();
		}
		System.out.println("good bye");
		
		
		
	}
	public static void main(String[] args) {
		TryCatchFinally tcf=new TryCatchFinally();
		tcf.read();
			
	}
}
