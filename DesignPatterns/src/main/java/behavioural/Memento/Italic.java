package behavioural.Memento;

public class Italic extends Command
{
	public Italic(StringContainer receiver)
	{
		super(receiver);
	}

	@Override
	public void execute()
	{
		// We need to call the super.execute() to create the memento.
		super.execute();
		receiver.setString("<em>" + receiver.getString() + "</em>");
	}

	/*   Undo() isn't needed anymore, it's handled by the base class via a memento.
	@Override
	public void Undo()
	{
	}
	*/
}
