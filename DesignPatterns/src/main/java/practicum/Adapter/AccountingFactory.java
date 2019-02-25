package practicum.Adapter;

public class AccountingFactory implements IAccountingFactory
{
	public IAccountsPayable makeAccountsPayable()
	{
		return new AccountsPayable();
	}
}
