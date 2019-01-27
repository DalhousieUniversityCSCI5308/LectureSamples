public class Database implements IUserPersistence
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
		//  user.setFirstName(dbReader("firstName"));
		//  user.setLastName(dbReader("lastName"));
		//  user.setEmail(dbReader("email"));
	}
}