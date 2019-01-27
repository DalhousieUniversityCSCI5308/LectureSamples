public abstract class DeviceWithEngine extends TransportationDevice
{
	protected boolean engineRunning;
	
	public DeviceWithEngine()
	{
		engineRunning = false;
	}
	
	public abstract void startEngine();
	public abstract void stopEngine();
	
	public void move()
	{
		startEngine();
		if (engineRunning)
		{
			System.out.println("Vroom I'm moving!");
		}
		stopEngine();
	}
}
