package practicum.Composite;

import java.util.List;

public interface IEmployee
{
	// These are the tasks (operations) we want each component in the hierarchy to perform.
	public IEmployee getManager();
	public void setManager(IEmployee manager);
	public void assignTask(String task);

	// Finish flushing out this interface to support the Composite pattern.

	public void add(IEmployee employee);
	public void remove(IEmployee employee);
	public List<IEmployee> getChildren();
	public IEmployee getChildren(int index);
}
