package behavioural.State;

public class WorkState implements IState
{
	public IState handle()
	{
		System.out.println("Working state");
		return new EndState();
	}
}