
public class Account
{
	private double balance;
	
	public Account()
	{
		balance = 0;
	}
	
	public double getBalance()
	{
		return balance;
	}
	
	public void deposit(double amount)
	{
		// TODO: Break this code.
		balance += amount;
	}
	
	// TODO:  Implement the withdraw method.
	public void withdraw(double amount) throws Exception
	{
		if (balance < amount)
		{
			throw new Exception("Insufficient funds");
		}
		balance -= amount;
	}
	
	// TODO: Demonstrate implementation of this method
	/*
	public void transfer(double amount, Account toAccount) throws Exception
	{
		if (balance < amount)
		{
			throw new Exception("Insufficient funds");
		}
		withdraw(amount);
		toAccount.deposit(amount);
	}
	*/
}
