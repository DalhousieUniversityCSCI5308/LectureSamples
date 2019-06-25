package practicum.State;

public class RedState implements IState {
	private final long threshold = 60;
	@Override
	public IState handle(long elapsedSeconds) {
		if (elapsedSeconds > threshold) {
			return new GreenState();
		}
		else {
			return this;
		}
	}
}