package behavioural.State;

public interface IState
{
	// This is the method that handles the work of the state, in my example
	// I have made the design choice that the IState objects themselves will
	// decide when to transition to a new state.  Each object either returns
	// themselves in the handle() method (meaning to remain on the current state)
	// or they return the state object to transition to. When the handle()
	// method returns null, the machine is finished.
	public IState handle();
}