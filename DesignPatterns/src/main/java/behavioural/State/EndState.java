package behavioural.State;

// The final state
public class EndState implements IState
{
	public IState handle()
	{
		System.out.println("End of state machine");
		return null;
	}
}