package practicum.Composite;

import java.util.List;

public class Worker extends Employee implements IEmployee
{
	private String mySpecialty;

	public Worker(String specialty)
	{
		mySpecialty = specialty;
	}
	
	@Override
	public void assignTask(String task)
	{
		if (task.equals(mySpecialty))
		{
			System.out.println("Performing " + task);
		}		
	}

	@Override
	public void add(IEmployee employee)
	{		
	}

	@Override
	public void remove(IEmployee employee)
	{		
	}

	@Override
	public List<IEmployee> getChildren()
	{
		return null;
	}

	@Override
	public IEmployee getChild(int index)
	{
		return null;
	}
	
}
