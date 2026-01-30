package edureka_bank;

public abstract class Bank 
{
	public int balance;
	
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
