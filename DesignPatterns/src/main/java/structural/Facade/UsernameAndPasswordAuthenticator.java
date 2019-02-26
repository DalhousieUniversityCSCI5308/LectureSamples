package structural.Facade;

public class UsernameAndPasswordAuthenticator
{
	public boolean authenticateUser(String userName, String password)
	{
		System.out.println("Checking username and password in a database...");
		return true;
	}
}
