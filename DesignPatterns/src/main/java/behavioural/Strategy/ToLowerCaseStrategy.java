package behavioural.Strategy;

public class ToLowerCaseStrategy implements IStrategy
{
	public String doOperation(String input)
	{
		return input.toLowerCase();
	}	
}