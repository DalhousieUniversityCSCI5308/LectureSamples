public class User
{
	private int id;
	private String firstName;
	private String lastName;
	private String email;
		
	public User(String firstName, String lastName, String email, IUserPersistence p)
	{
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		id = p.saveUser(this);
	}
	
	public User(int id, IUserPersistence p)
	{
		this.id = id;
		p.loadUser(id, this);
	}
	
	public String getFirstName()
	{
		return firstName;
	}
	
	public void setFirstName(String firstName)
	{
		this.firstName = firstName;
	}
	
	public String getLastName()
	{
		return lastName;
	}
	
	public void setLastName()
	{
		this.lastName = lastName;
	}
	
	public int getID()
	{
		return id;
	}
}