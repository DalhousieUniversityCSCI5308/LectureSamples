package behavioural.Command;

public class Italic extends Command
{
	public Italic(StringContainer receiver)
	{
		super(receiver);
	}

	@Override
	public void execute()
	{
		receiver.theString = "<em>" + receiver.theString + "</em>";
	}

	@Override
	public void undo()
	{
		receiver.theString = receiver.theString.substring(4, receiver.theString.length() - 5);
	}
}
