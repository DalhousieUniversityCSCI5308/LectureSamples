package practicum.Decorator;

public class RialCurrency extends CurrencyAbstract {

    public RialCurrency(Currency currency) {
        super(currency);
    }

    public String toString() {
        return "Rial" + String.format("%.2f", currency.getAmount());
    }
}
