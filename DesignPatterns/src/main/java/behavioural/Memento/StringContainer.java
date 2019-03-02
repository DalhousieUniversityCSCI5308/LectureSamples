package behavioural.Memento;

/*
	Here's where we'll implement the memento to allow simple undo capabilities.
	I'm making theString member variable private now.
*/
public class StringContainer
{
	private String theString;
	
	public StringContainer(String value)
	{
		theString = value;
	}
	
	public void setString(String value)
	{
		theString = value;
	}
	
	public String getString()
	{
		return theString;
	}
	
	public Memento getMemento()
	{
		return new Memento(theString);
	}
	
	public void restoreFromMemento(Memento memento)
	{
		theString = memento.getState();
	}
}