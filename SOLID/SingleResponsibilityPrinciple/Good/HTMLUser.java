public class HTMLUser extends User
{
	public HTMLUser(String firstName, String lastName, String email)
	{
		super(firstName, lastName, email);
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