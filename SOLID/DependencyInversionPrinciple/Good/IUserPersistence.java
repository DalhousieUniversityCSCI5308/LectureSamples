public interface IUserPersistence
{
	public void saveUser(User user);
	public void loadUser(int id, User user);
}