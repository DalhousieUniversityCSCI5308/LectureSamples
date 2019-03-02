package behavioural.Strategy;

public class Client
{
	public Client()
	{
		/*
		 * This example demonstrates the "A class defines many behaviours, and these appear as multiple
		 * conditional statements in its operations. Instead of many conditionals, move related conditional
		 * branches into their own strategy class." reason to use the Strategy pattern.
		 */
		Context context = new Context(new ToUpperCaseStrategy());
		System.out.println("Here is an uppercase string: " + context.executeStrategy("uppercase"));
		
		context.changeStrategy(new ToLowerCaseStrategy());
		System.out.println("Here is a lowercase string: " + context.executeStrategy("LOWERCASE"));
	}
}