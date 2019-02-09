package behavioural.State;

public class StartState implements IState
{
	public void Handle()
	{
		System.out.println("Starting state");
	}
}