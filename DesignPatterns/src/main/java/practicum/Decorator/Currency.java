package practicum.Decorator;

// https://www.thefinancials.com/Default.aspx?SubSectionID=curformat
public class Currency implements ICurrency
{
	private double amount;
	
	public Currency(double amount)
	{
		this.amount = amount;
	}
	
	public double getAmount()
	{
		return amount;
	}
	
	public void setAmount(double value)
	{
		amount = value;
	}
	
	public String toString()
	{
		return "$" + String.format("%.2f", amount); 
	}
}
