import java.util.*;

public class ReplaceDataValueWithObject
{
	private class Order
	{
		private final String customerName;
		private final double total;
		
		public Order(String customerName, double total)
		{
			this.customerName = customerName;
			this.total = total;
		}
		
		public String getCustomerName()
		{
			return customerName;
		}
		
		public double getTotal()
		{
			return total;
		}
	}
	
	private final List<Order> orders;
	
	public ReplaceDataValueWithObject()
	{
		orders = new ArrayList<Order>();
		orders.add(new Order("Fred", 20.0));
		orders.add(new Order("Fred", 10.0));
		orders.add(new Order("Manisha", 30.0));
		orders.add(new Order("Sven", 5.0));
	}
	
	// REPLACE DATA VALUE WITH OBJECT
	// The class Order treats the customer as a simple data value (their name as a String)
	// When we try to write logic that associates orders to customers we have to do string
	// comparisons and iterate through our object array.  As we write more logic in this
	// class this loop will repeat itself over and over.  If we convert the customer to be
	// an object that associates itself to orders rather than dumb data we can move logic
	// into that object and simplify code.
	public int numberOfOrdersForCustomer(String customerName)
	{
		int numOrders = 0;
		ListIterator<Order> iter = orders.listIterator();
		while (iter.hasNext())
		{
			Order o = iter.next();
			if (o.getCustomerName().equalsIgnoreCase(customerName))
			{
				numOrders++;
			}
		}
		return numOrders;
	}
}
