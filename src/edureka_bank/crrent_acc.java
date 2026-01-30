package edureka_bank;

import java.util.Scanner;

public class crrent_acc extends Bank
{
	static int amount;
	static int choice;
	
	void meth1() 
	{
		switch (choice) 
		{
		case 1 : this.deposite();
		case 2 : this.withdraw();
		
		case 3 : this.gettbalance();
		}
	}
	
	
	void deposite() {
		int tot=amount+this.balance;
		System.out.println("you have safely deposited the "+ amount);
		System.out.println("your current balance is "+tot);
		
	}

	void withdraw() {
		int tot=amount-this.balance;
		System.out.println("you have safely withdraw the "+ amount);
		System.out.println("your current balance is "+tot);
		
		
	}

	void gettbalance() {
		System.out.println("your current balance is "+this.balance);
		
	}
	public static void main(String[] args) {
		saveings_acc sa=new saveings_acc();
		sa.balance=10000;
		Scanner sc=new Scanner(System.in);
		System.out.println("plz enter the amount ");
		amount=sc.nextInt();
		sa.meth1();
		
	}

}
