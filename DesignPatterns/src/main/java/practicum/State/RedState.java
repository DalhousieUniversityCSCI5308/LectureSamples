package practicum.State;

public class RedState implements IState {
    private static long changeTime = 60;
    public IState changeLight() {
        long startTime = System.nanoTime();
        while(true){
            long timeElapsedInSeconds = (System.nanoTime() - startTime) / 1000;
            if(timeElapsedInSeconds >= changeTime){
                return new GreenState();
            }
        }

    }
}
