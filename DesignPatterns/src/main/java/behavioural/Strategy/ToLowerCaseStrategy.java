package behavioural.Strategy;

public class ToLowerCaseStrategy implements IStrategy
{
	public String DoOperation(String input)
	{
		return input.toLowerCase();
	}	
}