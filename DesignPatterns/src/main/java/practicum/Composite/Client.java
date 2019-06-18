package practicum.Composite;

public class Client
{
	private Manager CEO;
	public void doSomething()
	{
		// Create a CEO (the top of the company hierarchy)
		// Add 3 managers beneath the CEO
		// Add 3 workers beneath each manager, give each one a unique specialty task they perform
		// Assign all of the unique tasks to the CEO.
		CEO = new Manager();
		addManagers(3);
		CEO.assignTask("Slicing");
		CEO.assignTask("Frying");
		CEO.assignTask("Dicing");
		CEO.assignTask("Eating");
		CEO.assignTask("Drinking");
		CEO.assignTask("Sleeping");
		CEO.assignTask("Killing");
		CEO.assignTask("Hunting");
		CEO.assignTask("Feeding");

	}

	private void addManagers(int count)
	{
		Manager manager = new Manager();
		manager.workers.add(new Worker("Slicing"));
		manager.workers.add(new Worker("Dicing"));
		manager.workers.add(new Worker("Frying"));
		CEO.workers.add(manager);
		manager = new Manager();
		manager.workers.add(new Worker("Eating"));
		manager.workers.add(new Worker("Drinking"));
		manager.workers.add(new Worker("Sleeping"));
		CEO.workers.add(manager);
		manager = new Manager();
		manager.workers.add(new Worker("Killing"));
		manager.workers.add(new Worker("Hunting"));
		manager.workers.add(new Worker("Feeding"));
		CEO.workers.add(manager);
	}

	public static void main(String[] args) {
		Client c = new Client();
		c.doSomething();
	}
}
