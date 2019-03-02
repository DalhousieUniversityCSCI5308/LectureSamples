package behavioural.Memento;

public class Bold extends Command
{
	public Bold(StringContainer receiver)
	{
		super(receiver);
	}

	@Override
	public void execute()
	{
		// We need to call the super.execute() to create the memento.
		super.execute();
		receiver.setString("<strong>" + receiver.getString() + "</strong>");
	}

	/*   Undo() isn't needed anymore, it's handled by the base class via a memento.
	@Override
	public void Undo()
	{
	}
	*/
}
