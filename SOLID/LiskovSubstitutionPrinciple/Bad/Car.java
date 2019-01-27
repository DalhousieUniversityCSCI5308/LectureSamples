public class Car extends TransportationDevice
{
	@Override
	public void startEngine()
	{
		engineRunning = true;
	}
	
	@Override
	public void stopEngine()
	{
		engineRunning = false;
	}
}
