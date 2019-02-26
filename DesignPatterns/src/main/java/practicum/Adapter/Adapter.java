package practicum.Adapter;

public class Adapter extends ExternalAccountsPayableSystem implements IAccountsPayable {
	
	public void printCheques() {
		printChecks();
	}

}
	