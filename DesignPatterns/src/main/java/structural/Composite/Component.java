package structural.Composite;

import java.util.ArrayList;

/*
	The component interface is the key to the design pattern in that
	it is the mechanism whereby clients can treat all nodes in the
	hierarchical structure the same.  Here we implement the interface via
	an abstract class.  This is a design choice, you can go with interface,
	however if you choose interface every possible leaf class would have to
	implement "do nothing" versions of add, remove and getChild.  By going with
	abstract class we can make having no children the default state for a Component
	and leave children to the Composite class.
*/
public abstract class Component
{
	// This operation searches the hierarchy for all nodes matching a value.
	public abstract ArrayList<Component> operation();

	public void add(Component child)
	{
		// Default implementation assumes no children.
	}

	public void remove(Component child)
	{
		// Default implementation assumes no children.
	}

	public Component getChild(int index)
	{
		// Return nothing, default implementation assumes no children.
		return null;
	}

}
