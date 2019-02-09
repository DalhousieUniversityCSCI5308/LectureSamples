package behavioural.Strategy;

public class ToUpperCaseStrategy implements IStrategy
{
	public String DoOperation(String input)
	{
		return input.toUpperCase();
	}	
}