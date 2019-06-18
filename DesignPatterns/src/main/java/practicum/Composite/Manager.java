package practicum.Composite;

import java.util.ArrayList;
import java.util.List;

public class Manager extends Employee
{
	private ArrayList<IEmployee> employees = new ArrayList<>();

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
	public IEmployee getChild(int index)
	{
		if(index < this.employees.size())
		{
			return this.employees.get(index);
		}
		
		return null;
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
	public List<IEmployee> getChildren()
	{
		return this.employees;
	}
}
