package structural.Facade;

public class IPAddressAuthenticator
{
	public boolean authenticateIPAddress(String ip)
	{
		System.out.println("Checking database for authorized IP addresses...");
		return true;
	}
}
