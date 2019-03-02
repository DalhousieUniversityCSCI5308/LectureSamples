package behavioural.State;

public class StartState implements IState
{
	public IState handle()
	{
		System.out.println("Starting state");
		return new WorkState();
	}
}