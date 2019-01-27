public class User
{
	protected int id;
	protected String firstName;
	protected String lastName;
	protected String email;
	
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
}