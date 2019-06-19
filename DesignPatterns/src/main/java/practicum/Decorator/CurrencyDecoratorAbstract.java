package practicum.Decorator;

public abstract class CurrencyDecoratorAbstract implements ICurrency {

    protected Currency currencyToDecorate;

    public CurrencyDecoratorAbstract(Currency currency) {
        this.currencyToDecorate = currency;
    }

    public abstract String toString();
}