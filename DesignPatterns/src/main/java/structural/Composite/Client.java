package structural.Composite;

import java.util.Random;
import java.util.ArrayList;

public class Client
{
	private final Component hierarchy;
	private final Random rand;

	public Client()
	{
		hierarchy = new Composite();
		rand = new Random();
		addRandomStuff(hierarchy);
		ArrayList<Component> leavesWithEvenValues = hierarchy.operation();
		System.out.println("There were " + leavesWithEvenValues.size() + " even value leaves!");
	}

	private void addRandomStuff(Component c)
	{
		addRandomNumberLeaves(c);
		int numCompositesToAdd = rand.nextInt();
		for (int i = 0; i < numCompositesToAdd; i++)
		{
			Component child = new Composite();
			c.add(child);
			addRandomStuff(child);
		}
	}

	private void addRandomNumberLeaves(Component c)
	{
		int numLeavesToAdd = rand.nextInt(100);
		for (int i = 0; i < numLeavesToAdd; i++)
		{
			Leaf leaf = new Leaf(rand.nextInt());
			c.add(leaf);
		}
	}
}
