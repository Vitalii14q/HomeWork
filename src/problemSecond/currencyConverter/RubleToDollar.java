package problemSecond.currencyConverter;

public class RubleToDollar extends CurrencyConverter{

    @Override
    public double converter(double ruble) {
        return ruble * 0.013;
    }
}
