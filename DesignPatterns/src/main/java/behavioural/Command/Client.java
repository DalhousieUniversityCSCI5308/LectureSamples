package behavioural.Command;

public class Client
{
	public Client()
	{
		Invoker invoker = new Invoker();
		StringContainer container = new StringContainer("a string!");
		invoker.storeCommand(new Italic(container));
		invoker.storeCommand(new Bold(container));
		invoker.processCommands();
		System.out.println(container.theString); // outputs "<strong><em>a string!</em></strong>"
		invoker.undoCommands();
		System.out.println(container.theString); // outputs "a string!"
	}
}