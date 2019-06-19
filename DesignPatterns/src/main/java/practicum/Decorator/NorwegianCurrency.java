package practicum.Decorator;

public class NorwegianCurrency extends CurrencyDecoratorAbstract {

    NorwegianCurrency(Currency currency) {
        super(currency);
    }

    @Override
    public String toString() {
        return String.format("%.2f", currencyToDecorate.getAmount()) + "kr";
    }

}