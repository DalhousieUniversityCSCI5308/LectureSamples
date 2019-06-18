package practicum.Composite;

import java.util.ArrayList;
import java.util.List;

public class Client
{
	public void doSomething()
	{
		List<String> tasks = new ArrayList<String>();
		
		// Create a CEO (the top of the company hierarchy)
		IEmployee ceo = new Manager();
		
		// Add 3 managers beneath the CEO
		for(int i = 0; i < 3; i++)
		{
			IEmployee man = new Manager();
			ceo.add(man);

			// Add 3 workers beneath each manager, give each one a unique specialty task they perform
			for(int j = 0; j < 3; j++)
			{
				String task = String.format("Speciality: %d-%d", i, j);
				IEmployee worker = new Worker(task);
				man.add(worker);
				tasks.add(task);
			}
		}
		
		// Assign all of the unique tasks to the CEO.
		for(String task: tasks)
		{
			ceo.assignTask(task);
		}
	}
	
	void main()
	{
		doSomething();
	}
}
