public class Database
{
	public int saveUser(User user)
	{
		// Some DB code to save the user out to the DB and generate a unique ID
		return id;
	}
	
	public int loadUser(int id, User user)
	{
		// Some DB code to load the user from the DB
		// ...
		//  user.firstName = dbReader("firstName");
		//  user.lastName = dbReader("lastName");
		//  user.email = dbReader("email");
	}
}