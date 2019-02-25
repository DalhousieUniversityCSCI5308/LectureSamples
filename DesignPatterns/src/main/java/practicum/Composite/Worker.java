package practicum.Composite;

public class Worker implements IEmployee
{
	private String mySpecialty;

	public Worker(String specialty)
	{
		mySpecialty = specialty;
	}

	public doWork(String task)
	{
		if (task.equals(mySpecialty))
		{
			System.out.println("Performing " + task);
		}
	}
}
