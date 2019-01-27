public class Car extends DeviceWithEngine
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
