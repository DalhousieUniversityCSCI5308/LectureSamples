package practicum.Composite;

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
		super.assignTask(task);

		if (task.equals(mySpecialty))
		{
			System.out.println("Performing " + task);
		}		
	}
	
}
