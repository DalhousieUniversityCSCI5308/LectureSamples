package CSCI5308.JUnit.data;

import CSCI5308.JUnit.users.Customer;

public interface CustomerFactory
{
	public Customer loadCustomer(long id);
}

