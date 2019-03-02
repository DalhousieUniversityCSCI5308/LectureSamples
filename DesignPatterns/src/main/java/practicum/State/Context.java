package practicum.State;

public class Context
{
	public enum TrafficLightState
	{
		GREEN,
		YELLOW,
		RED
	}
	
	private static final long GREEN_SECONDS = 60;
	private static final long YELLOW_SECONDS = 5;
	private static final long RED_SECONDS = 60;
	
	private TrafficLightState current;
	private long changeTime;
	
	public Context()
	{
		current = TrafficLightState.GREEN;
		changeTime = System.nanoTime();
		cycleTrafficLight();
	}
	
	public void cycleTrafficLight()
	{
		while (true)
		{
			// This is a great example of an explanatory variable.
			long timeElapsedInSeconds = (System.nanoTime() - changeTime) / 1000;
			switch (current)
			{
				case GREEN:
				{
					if (timeElapsedInSeconds >= GREEN_SECONDS)
					{
						current = TrafficLightState.YELLOW;
						changeTime = System.nanoTime();
					}
					break;
				}
				case YELLOW:
				{
					if (timeElapsedInSeconds >= YELLOW_SECONDS)
					{
						current = TrafficLightState.RED;
						changeTime = System.nanoTime();
					}
					break;
				}
				case RED:
				{
					if (timeElapsedInSeconds >= RED_SECONDS)
					{
						current = TrafficLightState.GREEN;
						changeTime = System.nanoTime();
					}
					break;
				}
			}
		}
	}
}
