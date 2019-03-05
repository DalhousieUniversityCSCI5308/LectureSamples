
public class WarehouseFactory implements IWarehouseFactory
{
	@Override
	public IBattery makeBattery(int capacity)
	{
		return new Battery(capacity);
	}

	@Override
	public IRobot makeRobot(int batteryCapacity)
	{
		IBattery battery = makeBattery(batteryCapacity);
		// TODO: Robots start in the IdleState, instantiate that here.
		State startState = null; //makeIdleState();
		return new Robot(battery, startState);
	}
	
	public IRobot makeRobotWithBatteryPack(int batteryCapacity, int packCapacity)
	{
		// TODO: Implement the Decorator pattern, and use it to decorate a regular
		//       battery with a battery pack, and create a robot with the battery pack.
		return null;
	}


}
