package behavioural.Mediator;

import java.util.HashMap;

/*
	This is the implementation of the mediator interface, we'll make it a singleton
	for convenience.
*/
public class AirTrafficController implements IAirTrafficControllerMediator
{
	private static AirTrafficController theOneATC = null;
	private final IAirport airport;
	private final HashMap<IAircraft, String> runwayAssignments;
	
	public static AirTrafficController instance()
	{
		// Lazy initialization
		if (null == theOneATC)
		{
			theOneATC = new AirTrafficController();
		}
		return theOneATC;
	}
	
	public AirTrafficController()
	{
		airport = new Airport();
		runwayAssignments = new HashMap<IAircraft, String>();
	}
	
	/*
		Take note in this method that the requesting aircraft has no idea how the
		mediator gets runways for it to land on.  It doesn't know who or what the
		mediator is talking to, or how the mediator talks to the object that gets
		the runway for the aircraft.
	*/
	public void requestRunway(IAircraft aircraft)
	{
		String runway = null;
		if (aircraft.isCapableOfLandingVertically())
		{
			runway = airport.getAvailableRunway(IAirport.LandingMethod.VERTICAL);
		}
		else
		{
			runway = airport.getAvailableRunway(IAirport.LandingMethod.RUNWAY);
		}
		if (null == runway)
		{
			aircraft.maintainHoldingPattern();
		}
		else
		{
			runwayAssignments.put(aircraft, runway);
			aircraft.proceedToRunway(runway);
		}
	}

	/*
		As above, the aircraft telling the mediator that it has parked has no idea
		what that does, it just is being a good aircraft and releasing resources
		it knows must be needed by other aircraft.
	*/
	public void parked(IAircraft aircraft)
	{
		String runway = runwayAssignments.get(aircraft);
		airport.releaseRunway(runway);
	}
}