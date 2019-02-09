package behavioural.Mediator;

public class Airplane implements IAircraft
{
	public Boolean IsCapableOfLandingVertically()
	{
		return false;
	}

	public void ProceedToRunway(String runway)
	{
		// Do landing!
		System.out.println("I'm a plane I need a runway");
		IAirTrafficControllerMediator atc = AirTrafficController.Instance();
		atc.Parked(this);
	}

	public void MaintainHoldingPattern()
	{
		System.out.println("Can't land yet, got to fly around in circles.");
	}
	
	public void AttemptToLand()
	{
		IAirTrafficControllerMediator atc = AirTrafficController.Instance();
		atc.RequestRunway(this);
	}
}