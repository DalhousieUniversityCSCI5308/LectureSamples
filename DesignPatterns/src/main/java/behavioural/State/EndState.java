package behavioural.State;

// The final state
public class EndState implements IState
{
	public void Handle()
	{
		System.out.println("End of state machine");
	}
}