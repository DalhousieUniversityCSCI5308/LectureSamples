package creational.Singleton;

public class SingletonUser
{
	public void useSingleton()
	{
		ConfigurationLoader loader = ConfigurationLoader.instance();
		System.out.println("ClassAuthor is: " + loader.value("ClassAuthor"));
	}
}