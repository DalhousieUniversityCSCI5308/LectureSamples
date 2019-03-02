package behavioural.Strategy;

public class ToUpperCaseStrategy implements IStrategy
{
	public String doOperation(String input)
	{
		return input.toUpperCase();
	}	
}