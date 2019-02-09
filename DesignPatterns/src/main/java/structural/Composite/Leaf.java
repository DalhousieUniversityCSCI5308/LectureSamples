package structural.Composite;

import java.util.ArrayList;

public class Leaf implements Component
{
	private int myValue;
	
	public Leaf(int value)
	{
		myValue = value;
	}
	
	/*
		This is a silly example, I return this Leaf object in an array list by
		itself if the Leaf's value is even.
	*/
	public ArrayList<Component> Operation()
	{
		if (myValue % 2 == 0)
		{
			ArrayList<Component> list = new ArrayList<Component>();
			list.add(this);
			return list;
		}
		return null;
	}

	public void Add(Component child)
	{
		// Do nothing I'm a leaf node.
	}

	public void Remove(Component child)
	{
		// Do nothing I'm a leaf node.
	}

	public Component GetChild(int index)
	{
		// Return nothing, I'm a leaf node.
		return null;
	}
}