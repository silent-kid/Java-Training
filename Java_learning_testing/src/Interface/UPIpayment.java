package Interface;

import java.util.Scanner;

public class UPIpayment implements Payment
{
	Scanner sc=new Scanner(System.in);
	
	public void pay() 
	{
		System.out.println("plz enter the ammount");
		int amt=sc.nextInt();
		System.out.println("tranction of"+amt+ " "+ "is successful.......!");
		
	}

	
	public void refund() 
	{
		System.out.println("refund will be intiated soon");
		
	}
	public static void main(String[] args) 
	{
		UPIpayment upi=new UPIpayment();
		upi.pay();
		upi.refund();
	}
}
