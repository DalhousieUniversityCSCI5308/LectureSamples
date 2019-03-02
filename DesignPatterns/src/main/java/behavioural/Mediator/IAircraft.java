package behavioural.Mediator;

public interface IAircraft
{
	public Boolean isCapableOfLandingVertically();
	public void proceedToRunway(String runway);
	public void maintainHoldingPattern();
}