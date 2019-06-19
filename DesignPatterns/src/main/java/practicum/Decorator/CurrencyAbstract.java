package practicum.Decorator;

public abstract class CurrencyAbstract implements ICurrency{

    protected Currency currency;

    public CurrencyAbstract(Currency currency){
        this.currency = currency;
    }

    public abstract String toString();

}
