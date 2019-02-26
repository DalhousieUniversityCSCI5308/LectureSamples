package structural.Facade;

public class AuthenticationFacade
{
	public boolean authenticateUser(User user)
	{
		if (user.username.length() > 0 && user.password.length() > 0)
		{
			UsernameAndPasswordAuthenticator auth1 = new UsernameAndPasswordAuthenticator();
			if (auth1.authenticateUser(user.username, user.password))
			{
				return true;
			}
		}
		if (user.ip.length() > 0)
		{
			IPAddressAuthenticator auth2 = new IPAddressAuthenticator();
			if (auth2.authenticateIPAddress(user.ip))
			{
				return true;
			}
		}
		if (user.employeeID.length() > 0 && user.company.length() > 0)
		{
			GroupCustomerAuthenticator auth3 = new GroupCustomerAuthenticator();
			if (auth3.authenticateGroupCustomer(user.company, user.employeeID))
			{
				return true;
			}
		}
		return false;
	}
}
