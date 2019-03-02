package behavioural.Memento;

public class Client
{
	public Client()
	{
		Invoker invoker = new Invoker();
		StringContainer container = new StringContainer("a string!");
		invoker.storeCommand(new Italic(container));
		invoker.storeCommand(new Bold(container));
		invoker.processCommands();
		System.out.println(container.getString()); // outputs "<strong><em>a string!</em></strong>"
		invoker.UndoCommands();
		System.out.println(container.getString()); // outputs "a string!"
	}
}