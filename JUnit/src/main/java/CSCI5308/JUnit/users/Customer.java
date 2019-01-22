package CSCI5308.JUnit.users;

import CSCI5308.JUnit.data.CustomerFactory;

//Demo TODO:
//1 - Generate tests for Customer
//2 - Mock customer objects loaded from DB.
public class Customer
{
	private long id;
	private ContactInfo contactInfo;
	
	public Customer(long id)
	{
		this.id = id;
		contactInfo = new ContactInfo();
	}
	
	public Customer(long id, CustomerFactory factory)
	{
		this.id = id;
		Customer loadedCustomer = factory.loadCustomer(id);
		contactInfo = loadedCustomer.getContactInfo();
	}
	
	public long getID()
	{
		return id;
	}
	
	public ContactInfo getContactInfo()
	{
		return contactInfo;
	}
	
	public void setContactInfo(ContactInfo info)
	{
		contactInfo = info;
	}
	
	// TODO: Implement a validate method
	/*
	public boolean IsValid()
	{
	}
	*/
}
