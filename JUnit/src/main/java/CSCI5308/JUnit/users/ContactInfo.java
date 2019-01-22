package CSCI5308.JUnit.users;

public class ContactInfo
{
	public String firstName;
	public String lastName;
	public String phone;
	public String fax;
	public String street;
	public String city;
	public String province;
	public String postalCode;
	public String country;
	public String email;
	
	public boolean IsBlank()
	{
		return (firstName == null &&
				 lastName == null &&
				 phone == null &&
				 fax == null &&
				 street == null &&
				 city == null &&
				 province == null &&
				 postalCode == null &&
				 country == null &&
				 email == null);
	}
	
	public boolean ContainsMinimumInfo()
	{
		// The minimum information required is a last name, phone number and email.
		return (lastName != null && lastName != "" &&
				  phone != null && phone != "" &&
				  email != null && email != "");
	}
}
