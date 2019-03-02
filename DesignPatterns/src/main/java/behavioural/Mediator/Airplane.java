package behavioural.Mediator;

public class Airplane implements IAircraft
{
	public Boolean isCapableOfLandingVertically()
	{
		return false;
	}

	public void proceedToRunway(String runway)
	{
		// Do landing!
		System.out.println("I'm a plane I need a runway");
		IAirTrafficControllerMediator atc = AirTrafficController.instance();
		atc.parked(this);
	}

	public void maintainHoldingPattern()
	{
		System.out.println("Can't land yet, got to fly around in circles.");
	}
	
	public void attemptToLand()
	{
		IAirTrafficControllerMediator atc = AirTrafficController.instance();
		atc.requestRunway(this);
	}
}