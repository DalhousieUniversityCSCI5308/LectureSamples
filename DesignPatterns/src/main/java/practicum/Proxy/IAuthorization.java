package practicum.Proxy;

public interface IAuthorization
{
	public enum SiteFeatures
	{
		NEWS,
		FORUM_READ,
		FORUM_POST,
		FORUM_MOD
	}
	
	public boolean isAuthorized(SiteFeatures feature);
}
