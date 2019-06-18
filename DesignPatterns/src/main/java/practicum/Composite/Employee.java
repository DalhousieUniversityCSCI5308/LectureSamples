package practicum.Composite;

public abstract class Employee implements IEmployee
{
	private IEmployee manager;

	@Override
	public IEmployee getManager()
	{
		return this.manager;
	}


	@Override
	public void setManager(IEmployee manager)
	{
		this.manager = manager;
	}
}
