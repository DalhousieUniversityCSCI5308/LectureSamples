package practicum.State;

public class GreenState implements IState {
	private final long threshold = 60;
	@Override
	public IState handle(long elapsedSeconds) {
		if (elapsedSeconds > threshold) {
			return new YellowState();
		}
		else {
			return this;
		}
	}
}