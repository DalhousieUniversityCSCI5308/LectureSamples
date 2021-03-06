package structural.Composite;

import java.util.ArrayList;

/*
	The Composite class is a container that holds many
	Component objects.  Operation() calls are done to every
	child in the container.
*/
public class Composite extends Component
{
	private ArrayList<Component> children;

	public Composite()
	{
		children = new ArrayList<Component>();
	}

	// The Composite operation here iterates through its children calling Operation()
	// to build a set of results from all its children.
	public ArrayList<Component> operation()
	{
		ArrayList<Component> results = new ArrayList<Component>();
		for (int i = 0; i < children.size(); i++)
		{
			Component child = getChild(i);
			ArrayList<Component> childResults = child.operation();
			if (null != childResults)
			{
				results.addAll(childResults);
			}
		}
		return results;
	}

	public void add(Component child)
	{
		children.add(child);
	}

	public void remove(Component child)
	{
		children.remove(child);
	}

	public Component getChild(int index)
	{
		return children.get(index);
	}
}
