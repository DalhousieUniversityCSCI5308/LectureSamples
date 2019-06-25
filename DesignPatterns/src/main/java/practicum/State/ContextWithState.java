package practicum.State;

public class Context
{
	private IState state;
	private long changeTime;


	public Context()
	{
	state = new GreenState();
		changeTime = System.nanoTime();
		cycleTrafficLight();
	}

	public void cycleTrafficLight() {
		while (true) {
			long timeElapsedInSeconds = (System.nanoTime() - changeTime) / 1000;
			IState newState = state.handle(timeElapsedInSeconds);
			changeTime = newState != state ? System.nanoTime() : changeTime;
			state = newState;
		}
	}
}