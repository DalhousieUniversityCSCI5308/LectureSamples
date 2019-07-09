package practicum.State;

public class StateMachine {

    private IState currentState;

    public StateMachine() {
        currentState = new GreenState();
    }

    public void runStateMachine()
    {
        do
        {
            currentState = currentState.changeLight();
        } while (currentState != null);
    }
}
