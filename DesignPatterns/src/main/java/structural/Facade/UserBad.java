package structural.Facade;

public class UserBad
{
	// To simplify this example I am not making get/set methods for all of these
	// do not make class member fields public though, maintain your blackbox and hide your details.
	public String username;
	public String password;
	public String ip;
	public String employeeID;
	public String company;
	public boolean isAuthenticated;
	
	public UserBad()
	{
		isAuthenticated = false;
		username = "";
		password = "";
		ip = "";
		employeeID = "";
		company = "";
	}
	
	/*
	 * Take a look at how bad this method is.  First of all it's quite complicated, but worst of all
	 * it's tightly coupled to 3 classes (for now, wait till you company wants even more ways to authenticate).
	 */
	public void authenticate()
	{
		if (username.length() > 0 && password.length() > 0)
		{
			UsernameAndPasswordAuthenticator auth1 = new UsernameAndPasswordAuthenticator();
			isAuthenticated = auth1.authenticateUser(username, password);
			if (isAuthenticated)
			{
				return;
			}
		}
		if (ip.length() > 0)
		{
			IPAddressAuthenticator auth2 = new IPAddressAuthenticator();
			isAuthenticated = auth2.authenticateIPAddress(ip);
			if (isAuthenticated)
			{
				return;
			}
		}
		if (employeeID.length() > 0 && company.length() > 0)
		{
			GroupCustomerAuthenticator auth3 = new GroupCustomerAuthenticator();
			isAuthenticated = auth3.authenticateGroupCustomer(company, employeeID);
			if (isAuthenticated)
			{
				return;
			}
		}
		isAuthenticated = false;
	}
}
