package practicum.Adapter;

public class ExternalAdapter extends ExternalAccountsPayableSystem implements IAccountsPayable{
    IAccountingFactory accountingFactory = new AccountingFactory();
    public void printCheques() {
        super.printChecks();
    }

}
