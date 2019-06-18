package practicum.Composite;

import java.util.ArrayList;

public class Manager implements IEmployee
{
    public ArrayList<IEmployee> workers = new ArrayList<IEmployee>();

    public IEmployee getManager() {
        return null;
    }

    public void assignTask(String task) {
        for (int i = 0; i < workers.size(); i++)
		{
            workers.get(i).assignTask(task);
		}
    }
}
