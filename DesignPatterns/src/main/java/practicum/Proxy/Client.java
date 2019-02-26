package practicum.Proxy;

import structural.Facade.*;

public class Client
{
	public void verifyUserAccess()
	{
		User user = new User();
		user.username = "rhawkey";
		user.password = "frenchtoast";
		user.company = "Dalhousie";
		user.employeeID = "B000000001";
		user.ip = "127.0.0.1";
		user.authenticate();
	}
}
