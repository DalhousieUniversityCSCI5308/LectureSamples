package practicum.Adapter;

import java.util.*;

public class AccountsPayable implements IAccountsPayable
{
	List<Object> invoices;
	
	public AccountsPayable()
	{
		invoices = new ArrayList<Object>();
		loadInvoicesFromDB();
	}
	
	private void loadInvoicesFromDB()
	{
		System.out.println("Loading invoices from DB");
	}
	
	public void printCheques()
	{
		Iterator<Object> i = invoices.iterator();
		while (i.hasNext())
		{
			Object invoice = i.next();
			printCheque(invoice);
		}
	}
	
	private void printCheque(Object invoice)
	{
		System.out.println("Do whatever to print a cheque");
	}
}
