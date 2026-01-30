package edu_test;

public abstract class Bank 
{
	private int balance;
	
	abstract void deposite() ;
	abstract void withdraw() ;
	abstract void  gettbalance();

	public int getBalance()
	{
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}

}
