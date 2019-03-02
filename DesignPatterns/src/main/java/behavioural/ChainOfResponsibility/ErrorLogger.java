package behavioural.ChainOfResponsibility;

// Here's another concrete handler
public class ErrorLogger extends Logger
{
	public ErrorLogger()
	{
		super(Logger.ERROR);
	}

	@Override
	protected void logMessage(String message)
	{
		// Error messages go to System.out and send an email to someone to alert them!
		System.out.println(message);
		sendEmail(message);
	}
	
	private void sendEmail(String message)
	{
		// Blah blah send an email
	}
}