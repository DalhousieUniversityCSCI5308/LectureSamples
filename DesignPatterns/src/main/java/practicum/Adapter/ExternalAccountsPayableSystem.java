package practicum.Adapter;

/*
 * This is just a dummy placeholder to show you a different class that is supposed to do
 * the same thing AccountsPayable does, just in a different way, with different methods.
 * If this class was written by a 3rd party and you were asked to use it in your code
 * you would have to adapt to its methods / exposed interface / interaction.
 */
public class ExternalAccountsPayableSystem
{
	public ExternalAccountsPayableSystem()
	{
		
	}
	
	// This method must be called first to "load invoices from somewhere"
	// Maybe they come from a database?  Who knows.  If you are adapting to use a 3rd
	// party class to handle the work, you no longer care how it does the work.
	public void loadInvoices()
	{
		
	}
	
	// This class expects you to first filter out already paid invoices before you
	// print cheques.
	public void filterPreviouslyPaid()
	{
		
	}
	
	// Ack!  This class was written by some Americans... Booooo
	public void printChecks()
	{
		
	}
}
