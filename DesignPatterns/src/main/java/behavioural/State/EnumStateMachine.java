package behavioural.State;

public class EnumStateMachine
{
	public enum States
	{
		START_STATE,
		WORK_STATE,
		END_STATE,
		FINISHED
	};
	
	private States currentState;
	
	public EnumStateMachine()
	{
		currentState = States.START_STATE;
	}
	
	public void runStateMachine()
	{
		while (currentState != States.FINISHED)
		{
			switch (currentState)
			{
				case START_STATE:
				{
					doStartState();
					currentState = States.WORK_STATE;
					break;
				}
				case WORK_STATE:
				{
					doWorkState();
					currentState = States.END_STATE;
					break;
				}
				case END_STATE:
				{
					doEndState();
					currentState = States.FINISHED;
					break;
				}
				default:
				{
					
				}
			}
		}
	}
	
	private void doStartState()
	{
		System.out.println("Starting state");
	}
	
	private void doWorkState()
	{
		System.out.println("Working state");
	}
	
	private void doEndState()
	{
		System.out.println("End of state machine");
	}
}