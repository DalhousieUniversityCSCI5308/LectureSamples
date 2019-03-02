package behavioural.Mediator;

public class Helicopter implements IAircraft
{
	public Boolean isCapableOfLandingVertically()
	{
		return true;
	}

	public void proceedToRunway(String runway)
	{
		// Do landing!
		System.out.println("I'm a helicopter I go up and down yay");
		IAirTrafficControllerMediator atc = AirTrafficController.instance();
		atc.parked(this);
	}

	public void maintainHoldingPattern()
	{
		System.out.println("Can't land yet, got to hover.");
	}
	
	public void attemptToLand()
	{
		IAirTrafficControllerMediator atc = AirTrafficController.instance();
		atc.requestRunway(this);
	}
}