package practicum.Composite;

public interface IEmployee {
    // These are the tasks (operations) we want each component in the hierarchy to
    // perform.
    public IEmployee getManager();

    public void assignTask(String task);

    public void setManager(IEmployee manager);

    // Finish flushing out this interface to support the Composite pattern.
    public void add(IEmployee employee);

    public void remove(IEmployee employee);

    public IEmployee getChild(int index);
}
