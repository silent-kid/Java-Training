package Encapsulation;

public class Bank
{
	private int balance;
	String pass;
	String crtpass="mybalance";

	public int getBalance() {
		if(pass.equalsIgnoreCase(crtpass))
		{
			System.out.println("hiiii inside if");
		}	
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
	
}
