package practicum.Composite;

public interface IEmployee
{
	// These are the tasks (operations) we want each component in the hierarchy to perform.
	public IEmployee getManager();
	public void assignTask(String task);

	// Finish flushing out this interface to support the Composite pattern.
}
