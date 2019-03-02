package behavioural.Mediator;

public interface IAirport
{
	public enum LandingMethod
	{
		VERTICAL,
		RUNWAY
	}
	public String getAvailableRunway(LandingMethod type);
	public void allocateRunway(String runway);
	public void releaseRunway(String runway);
}