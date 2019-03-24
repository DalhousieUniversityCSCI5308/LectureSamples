import java.util.*;

public class IntroduceParameterObject
{
	private class Order
	{
		private final Date date;
		private final float amount;
		
		public Order(float amount, Date date)
		{
			this.date = date;
			this.amount = amount;
		}
		
		public float getAmount()
		{
			return amount;
		}
		
		public Date getDate()
		{
			return date;
		}
	}
	
	private class Account
	{
		private final List<Order> orders;
		
		public Account()
		{
			orders = new ArrayList<Order>();
		}
		
		public void addOrder(Order order)
		{
			orders.add(order);
		}
		
		// INTRODUCE PARAMETER OBJECT
		// Here the list of parameters is not that long, but another reason to use
		// this refactoring is when parameters are often passed together.  Think of
		// how often you do this (e.g. username & password, operands to an algorithm,
		// etc...). By converting them to an object, you can not only shorten the
		// parameter list but also move functionality to that object.
		public float orderTotalBetweenDates(Date start, Date end)
		{
			float total = 0.0f;
			ListIterator<Order> iter = orders.listIterator();
			while (iter.hasNext())
			{
				Order o = iter.next();
				if (start.before(o.date) && end.after(o.date))
				{
					total += o.getAmount();
				}
			}
			return total;
		}
	}
	
	public float getSampleOrderTotal()
	{
		Account a = new Account();
		Calendar c = Calendar.getInstance();
		c.set(2019, 1, 1, 1, 0, 0);
		Order o = new Order(10.0f, c.getTime());
		a.addOrder(o);
		c.set(2019, 5, 1, 1, 0, 0);
		o = new Order(20.0f, c.getTime());
		a.addOrder(o);
		c.set(2019, 0, 1, 0, 0, 0);
		Date start = c.getTime();
		c.set(2019, 3, 1, 0, 0, 0);
		Date end = c.getTime();
		return a.orderTotalBetweenDates(start, end);
	}
}
