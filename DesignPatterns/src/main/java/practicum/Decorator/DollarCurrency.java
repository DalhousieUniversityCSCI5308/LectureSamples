package practicum.Decorator;

public class DollarCurrency extends CurrencyAbstract {

    public DollarCurrency(Currency currency) {
        super(currency);
    }

    public String toString() {
        return "$" + String.format("%.2f", currency.getAmount());
    }
}
