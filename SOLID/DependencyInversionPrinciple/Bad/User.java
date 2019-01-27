public class User
{
	public int id;
	public String firstName;
	public String lastName;
	public String email;
	
	public User(String firstName, String lastName, String email)
	{
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		Database db = new Database();
		id = db.saveUser(this);
	}
	
	public User(int id)
	{
		this.id = id;
		Database db = new Database();
		db.loadUser(id, this);
	}
}