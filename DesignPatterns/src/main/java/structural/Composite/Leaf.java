package structural.Composite;

import java.util.ArrayList;

public class Leaf extends Component
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
	public ArrayList<Component> operation()
	{
		if (myValue % 2 == 0)
		{
			ArrayList<Component> list = new ArrayList<Component>();
			list.add(this);
			return list;
		}
		return null;
	}
}
