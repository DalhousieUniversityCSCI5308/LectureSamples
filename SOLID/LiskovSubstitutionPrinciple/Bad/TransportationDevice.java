public abstract class TransportationDevice
{
	protected boolean engineRunning;
	
	public TransportationDevice()
	{
		engineRunning = false;
	}
	
	public abstract void startEngine();
	public abstract void stopEngine();
	
	public void move()
	{
		if (engineRunning)
		{
			System.out.println("Vroom I'm moving!");
		}
	}
}
