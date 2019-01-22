package CSCI5308.JUnit.users;

import CSCI5308.JUnit.data.ICustomerFactory;
import java.util.*;

public class CustomerFactoryMock implements ICustomerFactory
{
	private Map<String, Customer> customers;
	
	public CustomerFactoryMock()
	{
		customers = new HashMap<String, Customer>();
		addCustomers();
	}
	
	private void addCustomers()
	{
		Customer customer = new Customer(1);
		ContactInfo info = new ContactInfo();
		info.firstName = "Rob";
		info.lastName = "Hawkey";
		info.phone = "1234567890";
		info.fax = "1234567891";
		info.street = "12 Main";
		info.city = "Halifax";
		info.province = "Nova Scotia";
		info.postalCode = "H0H0H0";
		info.country = "Canada";
		info.email = "rhawkey@gmail.com";
		customer.setContactInfo(info);
		customers.put("1", customer);
		
		customer = new Customer(2);
		info = new ContactInfo();
		info.firstName = "Kirstie";
		info.lastName = "Hawkey";
		info.phone = "1239999999";
		info.email = "funkyemail@emailtown.com";
		customer.setContactInfo(info);
		customers.put("2", customer);
	}
	
	@Override
	public Customer loadCustomer(long id)
	{
		String idStr = Long.toString(id);
		if (customers.containsKey(idStr))
		{
			return customers.get(idStr);
		}
		return null;
	}
}
