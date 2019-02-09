package structural.Decorator;

public class BankAccount implements IBankAccount
{
	private float balance;
	
	public BankAccount()
	{
		balance = 0.0f;
	}

	public void Credit(float amount)
	{
		balance += amount;
	}

	public void Debit(float amount)
	{
		balance -= amount;
	}

	public float GetBalance()
	{
		return balance;
	}
}