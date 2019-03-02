package behavioural.State;


public class PatternStateMachine
{
	private IState currentState;
	
	public PatternStateMachine()
	{
		currentState = new StartState();
	}
	
	public void runStateMachine()
	{
		do
		{
			currentState = currentState.handle();
		} while (currentState != null);
	}
}