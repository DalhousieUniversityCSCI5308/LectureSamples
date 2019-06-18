package practicum.Composite;

import java.util.ArrayList;
import java.util.List;

public abstract class Employee implements IEmployee
{
	private IEmployee manager;
	private ArrayList<IEmployee> employees = new ArrayList<>();

	@Override
	public IEmployee getManager()
	{
		return this.manager;
	}

	@Override
	public void assignTask(String task)
	{
		for(IEmployee employee: this.employees)
		{
			employee.assignTask(task);
		}
	}

	@Override
	public void add(IEmployee employee)
	{
		this.employees.add(employee);
		employee.setManager(this);
	}

	@Override
	public void remove(IEmployee employee)
	{
		this.employees.remove(employee);
	}

	@Override
	public List<IEmployee> getChildren()
	{
		return this.employees;
	}

	@Override
	public void setManager(IEmployee manager)
	{
		this.manager = manager;
	}

	@Override
	public IEmployee getChildren(int index)
	{
		if(index < this.employees.size())
		{
			return this.employees.get(index);
		}
		
		return null;
	}
}
