package behavioural.Observer;

public interface ISubject
{
	// Subscribe an observer to the subject. The observer will be
	// notified when the subject is notified.
	public void attach(IObserver observer);
	
	// Cancel an observer's subscription to the subject. The observer
	// is no longer interested in being notified.
	public void detach(IObserver observer);
	
	// Notify all observers of the subject that the subject
	// event has happened. I wanted this to be called notify() but
	// Java has the Object.notify() method as final.
	public void notifyObservers();
}