package structural.Decorator;

public class Person implements IPersonPersistence
{
	private String firstName;
	private String lastName;
	
	public Person(String firstName, String lastName)
	{
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	public String getFirstName()
	{
		return firstName;
	}
	
	public void setFirstName(String value)
	{
		firstName = value;
	}
	
	public String getLastName()
	{
		return lastName;
	}
	
	public void setLastName(String value)
	{
		lastName = value;
	}

	public void save()
	{
		// Pretend to save to a database
		System.out.println("Saving to database");
	}

	public void load()
	{
		// Pretend to load from a database.
		firstName = "Rob";
		lastName = "Hawkey";
	}
}
