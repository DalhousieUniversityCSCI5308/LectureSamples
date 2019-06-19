package practicum.Decorator;
public class KoreanCurrency extends  CurrencyAbstract{

    public KoreanCurrency(Currency currency) {
        super(currency);
    }

    public String toString() {
        return String.format("%.2f", currency.getAmount()) + "kr";
    }
}
