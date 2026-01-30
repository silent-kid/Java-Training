package edu_test;

import java.util.Scanner;

public class crrent_acc extends Bank
{
	
	static int amount;
	static int choice;
	
	
	
	
	void deposite() {
		int tot=this.amount+super.getBalance();
		
		System.out.println("you have safely deposited the "+ this.amount);
		System.out.println("your current balance is "+tot);
		
	}

	void withdraw() {
		int tot=amount-super.getBalance();
		System.out.println("you have safely withdraw the "+ amount);
		System.out.println("your current balance is "+tot);
		
		
	}

	void gettbalance() {
		System.out.println("your current balance is "+super.getBalance());
		
	}
	public static void main(String[] args) {
		crrent_acc sa=new crrent_acc();
		int bb=10000;
		sa.setBalance(bb);
		Scanner sc=new Scanner(System.in);
		System.out.println("plz enter the amount ");
		amount=sc.nextInt();
		System.out.println("click 1 for deposite");
		System.out.println("click 2 for withdraw");
		System.out.println("click 3 for see balance");
		choice=sc.nextInt();
		switch (choice) 
		{
		case 1 : sa.deposite();
				break;
		case 2 : sa.withdraw();
				break;
		
		case 3 : sa.gettbalance();
				break;
		}
		
		
	}

}
