package practicum.Adapter;

/*
 * This is just a simple use of the AccountsPayable class.  Use your imagination
 * to picture a massive accounting system where the AccountsPayable class is referenced
 * in many classes in complicated logic that is core to a company's business.  If you
 * want to change how you manage accounts payable without modifying all of that code,
 * use an adapter!
 */
public class Main
{
	public void main()
	{
		AccountsPayable ap = new AccountsPayable();
		ap.printCheques();
	}
}
