package behavioural.Command;

// The interface all commands implement.
public abstract class Command
{
	// This is the object on whom we will execute the command.
	// The receiving object could be anything, and the command
	// we execute could be anything.
	protected StringContainer receiver;
	
	public Command(StringContainer receiver)
	{
		this.receiver = receiver;
	}
	
	public abstract void execute();
	public abstract void undo();
}