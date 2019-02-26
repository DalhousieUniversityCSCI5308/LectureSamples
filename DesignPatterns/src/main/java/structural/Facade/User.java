package structural.Facade;

public class User
{
	// To simplify this example I am not making get/set methods for all of these
	// do not make class member fields public though, maintain your blackbox and hide your details.
	public String username;
	public String password;
	public String ip;
	public String employeeID;
	public String company;
	public boolean isAuthenticated;
	
	public User()
	{
		isAuthenticated = false;
		username = "";
		password = "";
		ip = "";
		employeeID = "";
		company = "";
	}
	
	/*
	 * Much better!  Now the class is only coupled to the facade.  We only have to go to the facade to change
	 * authentication methods (add new ones, change how old ones are used, change priority, etc..)
	 */
	public void authenticate()
	{
		AuthenticationFacade facade = new AuthenticationFacade();
		isAuthenticated = facade.authenticateUser(this);
	}
}
