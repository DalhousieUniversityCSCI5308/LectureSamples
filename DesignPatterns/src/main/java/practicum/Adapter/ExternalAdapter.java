package practicum.Adapter;

public class ExternalAdapter extends ExternalAccountsPayableSystem implements IAccountsPayable{
    public void printCheques() {
        super.printChecks();
    }

}
