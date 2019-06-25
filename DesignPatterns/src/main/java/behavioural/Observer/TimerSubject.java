package behavioural.Observer;

import javax.swing.Timer;
import java.awt.event.*;

public class TimerSubject extends Subject
{
	/*
		This subject notifies it's observers once every second.
	*/
	public TimerSubject()
	{
		super();
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
}