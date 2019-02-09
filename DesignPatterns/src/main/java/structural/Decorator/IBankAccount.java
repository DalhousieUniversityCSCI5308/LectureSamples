package structural.Decorator;

public interface IBankAccount
{
	public void Credit(float amount);
	public void Debit(float amount);
	public float GetBalance();
}