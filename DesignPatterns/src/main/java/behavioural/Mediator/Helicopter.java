package behavioural.Mediator;

public class Helicopter implements IAircraft
{
	public Boolean IsCapableOfLandingVertically()
	{
		return true;
	}

	public void ProceedToRunway(String runway)
	{
		// Do landing!
		System.out.println("I'm a helicopter I go up and down yay");
		IAirTrafficControllerMediator atc = AirTrafficController.Instance();
		atc.Parked(this);
	}

	public void MaintainHoldingPattern()
	{
		System.out.println("Can't land yet, got to hover.");
	}
	
	public void AttemptToLand()
	{
		IAirTrafficControllerMediator atc = AirTrafficController.Instance();
		atc.RequestRunway(this);
	}
}