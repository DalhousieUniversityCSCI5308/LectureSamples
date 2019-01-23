package CSCI5308.JUnit.users;

import CSCI5308.JUnit.data.ICustomerFactory;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class CustomerTest
{
	private static ICustomerFactory factory;

	@BeforeAll
	static void setUpBeforeClass() throws Exception
	{
		factory = new CustomerFactoryMock();
	}

	@Test
	void testCustomerLong()
	{
		Customer customer = new Customer(1);
		assertEquals(1, customer.getID());
		assertTrue(customer.getContactInfo().IsBlank());
	}

	@Test
	void testCustomerLongICustomerFactory()
	{
		Customer customer = new Customer(1, factory);
		assertEquals("Rob", customer.getContactInfo().firstName);
		assertEquals("Hawkey", customer.getContactInfo().lastName);
		customer = new Customer(2, factory);
		assertEquals(null, customer.getContactInfo().province);
		customer = new Customer(10, factory);
		assertEquals(null, customer.getContactInfo());
	}

	@Test
	void testGetID()
	{
		Customer customer = new Customer(10);
		assertEquals(10, customer.getID());
	}

	@Test
	void testGetContactInfo()
	{
		Customer customer = new Customer(1);
		ContactInfo info = new ContactInfo();
		info.firstName = "Rob";
		customer.setContactInfo(info);
		assertEquals("Rob", customer.getContactInfo().firstName);
	}

	@Test
	void testSetContactInfo()
	{
		Customer customer = new Customer(1);
		ContactInfo info = new ContactInfo();
		info.firstName = "Rob";
		customer.setContactInfo(info);
		assertEquals("Rob", customer.getContactInfo().firstName);
	}

}
