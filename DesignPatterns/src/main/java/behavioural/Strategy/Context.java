package behavioural.Strategy;

public class Context
{
	private IStrategy strategy;
	
	public Context(IStrategy strategy)
	{
		this.strategy = strategy;
	}
	
	public void changeStrategy(IStrategy strategy)
	{
		this.strategy = strategy;
	}
	
	public String executeStrategy(String input)
	{
		return strategy.doOperation(input);
	}
}