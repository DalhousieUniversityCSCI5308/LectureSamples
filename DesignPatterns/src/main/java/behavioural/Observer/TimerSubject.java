package behavioural.Observer;

import javax.swing.Timer;
import java.util.List;
import java.util.ArrayList;
import java.awt.event.*;
import java.util.ListIterator;

public class TimerSubject implements ISubject
{
	private List<IObserver> observers;
	
	/*
		This subject notifies it's observers once every second.
	*/
	public TimerSubject()
	{
		observers = new ArrayList<IObserver>();
		int delay = 1000; //milliseconds
		ActionListener taskPerformer = new ActionListener()
		{
			public void actionPerformed(ActionEvent evt)
			{
				notifyObservers();
			}
		};
		new Timer(delay, taskPerformer).start();
	}

	public void attach(IObserver observer)
	{
		observers.add(observer);
	}

	public void detach(IObserver observer)
	{
		observers.remove(observer);
	}

	/*
		When the subject is notified it must iterate through its observers and
		send them all the update message.
	*/
	public void notifyObservers()
	{
		ListIterator<IObserver> iter = observers.listIterator();
		while (iter.hasNext())
		{
			iter.next().update();
		}
	}
}