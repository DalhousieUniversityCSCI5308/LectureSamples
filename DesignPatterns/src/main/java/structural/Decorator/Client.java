package structural.Decorator;

public class Client 
{
	public Client()
	{
		Person joe = new Person("Joe", "Smith");
		IPersonPersistence p = new PersonFromFile(joe, "joe.txt");
		p.load();
		p.save();
	}
	
}
