package behavioural.Observer;

public class Client
{
	public Client()
	{
		// Create a subject that notifies its observers once per second.
		Subject subject = new TimerSubject();
		// Create an observer that outputs the time when notified.
		IObserver observer = new OutputObserver();
		// Add the observer to the subject (subscribe to its notifications)
		// as soon as we do this it will immediately start getting notified ever
		// second by the subject.
		subject.attach(observer);
		// Go do something else...
	}
}