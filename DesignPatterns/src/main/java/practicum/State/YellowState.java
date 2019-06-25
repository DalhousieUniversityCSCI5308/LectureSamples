package practicum.State;

public class YellowState implements IState {
	private final long threshold = 5;
	@Override
	public IState handle(long elapsedSeconds) {
		if (elapsedSeconds > threshold) {
			return new RedState();
		}
		else {
			return this;
		}
	}
}