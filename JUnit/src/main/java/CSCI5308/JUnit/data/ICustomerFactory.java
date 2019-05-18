package CSCI5308.JUnit.data;

import CSCI5308.JUnit.users.ContactInfo;

public interface ICustomerFactory
{
	public ContactInfo loadCustomerContactInfo(long id);
}

