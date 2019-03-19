public class ExtractClass
{
	private final long userID;
	private final String username;
	private final String password;
	private final String street;
	private final String city;
	private final String province;
	private final String country;
	private final String postalCode;
	
	public ExtractClass(long userID, String username, String password, String street, String city,
							  String province, String country, String postalCode)
	{
		this.userID = userID;
		this.username = username;
		this.password = password;
		this.street = street;
		this.city = city;
		this.province = province;
		this.country = country;
		this.postalCode = postalCode;
	}
	
	public boolean isPasswordCorrect(String password)
	{
		return this.password.equals(password);
	}
	
	// EXTRACT CLASS
	// Either this class is about usernames and passwords and authentication, or
	// about the nationality of a user, how do we fix this?
	public boolean isCanadian()
	{
		return country.equalsIgnoreCase("canada");
	}
}
