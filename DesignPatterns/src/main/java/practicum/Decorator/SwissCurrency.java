package practicum.Decorator;

public class SwissCurrency extends CurrencyAbstract {

    public SwissCurrency(Currency currency) {
        super(currency);
    }

    public String toString() {
        return "₣" + String.format("%.2f", currency.getAmount());
    }
}
