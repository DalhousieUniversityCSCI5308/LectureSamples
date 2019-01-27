public class User
{
	private int id;
	private String firstName;
	private String lastName;
	private String email;
	
	public User(String firstName, String lastName, String email)
	{
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
	}
	
	public boolean isValid()
	{
		return (firstName != "" && firstName != null &&
				  lastName != "" && lastName != null &&
				  email != "" && email != null);
	}
	
	public String displayName()
	{
		if (isValid())
		{
			return "<H1>" + firstName + " " + lastName + "</H1><BR/><H2>" + email + "</H2>";
		}
		else
		{
			return "<BLINK>INVALID!</BLINK>";
		}
	}
}