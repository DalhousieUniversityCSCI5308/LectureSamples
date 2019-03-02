package behavioural.Command;

public class Bold extends Command
{
	public Bold(StringContainer receiver)
	{
		super(receiver);
	}

	@Override
	public void execute()
	{
		receiver.theString = "<strong>" + receiver.theString + "</strong>";
	}

	@Override
	public void undo()
	{
		receiver.theString = receiver.theString.substring(8, receiver.theString.length() - 9);
	}
}
