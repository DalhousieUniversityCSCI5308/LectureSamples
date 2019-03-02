package practicum.Observer;

import java.util.*;

public abstract class Subject
{
	private List<IObserver> observers;
	
	public Subject()
	{
		observers = new ArrayList<IObserver>();
	}
	
	public void attach(IObserver observer)
	{
		observers.add(observer);
	}
	
	public void detach(IObserver observer)
	{
		observers.remove(observer);
	}
	
	public abstract void notify(int bid);
}
