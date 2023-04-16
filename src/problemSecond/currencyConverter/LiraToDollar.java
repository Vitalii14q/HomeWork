package problemSecond.currencyConverter;

public class LiraToDollar extends CurrencyConverter{

    @Override
    public double converter(double lira) {
        return lira * 0.052;
    }
}
