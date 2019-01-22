package CSCI5308.JUnit.users;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ContactInfoTest
{
	@Test
	public void testIsBlank()
	{
		ContactInfo info = new ContactInfo();
		assertTrue(info.IsBlank());
		info.firstName = "Rob";
		assertFalse(info.IsBlank());
		info.firstName = null;
		info.lastName = "Hawkey";
		assertFalse(info.IsBlank());
		info.lastName = null;
		info.phone = "1234567890";
		assertFalse(info.IsBlank());
		info.phone = null;
		info.fax = "1234567890";
		assertFalse(info.IsBlank());
		info.fax = null;
		info.street = "123 Main";
		assertFalse(info.IsBlank());
		info.street = null;
		info.city = "Halifax";
		assertFalse(info.IsBlank());
		info.city = null;
		info.province = "Nova Scotia";
		assertFalse(info.IsBlank());
		info.province = null;
		info.postalCode = "H0H0H0";
		assertFalse(info.IsBlank());
		info.postalCode = null;
		info.country = "Canada";
		assertFalse(info.IsBlank());
		info.country = null;
		info.email = "firstname@lastname.com";
		assertFalse(info.IsBlank());
		info.email = null;
	}

	@Test
	public void testContainsMinimumInfo()
	{
		ContactInfo info = new ContactInfo();
		info.lastName = "Hawkey";
		info.phone = "1234567890";
		info.email = "firstname@lastname.com";
		assertTrue(info.ContainsMinimumInfo());
		info.email = null;
		assertFalse(info.ContainsMinimumInfo());
		info.email = "";
		assertFalse(info.ContainsMinimumInfo());
		info.email = "firstname@lastname.com";
		info.phone = null;
		assertFalse(info.ContainsMinimumInfo());
		info.phone = "";
		assertFalse(info.ContainsMinimumInfo());
		info.phone = "1234567890";
		info.lastName = null;
		assertFalse(info.ContainsMinimumInfo());
		info.lastName = "";
		assertFalse(info.ContainsMinimumInfo());		
	}
}
