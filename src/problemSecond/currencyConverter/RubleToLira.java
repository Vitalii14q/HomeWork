package problemSecond.currencyConverter;

public class RubleToLira extends CurrencyConverter{

    @Override
    public double converter(double ruble) {
        return ruble * 0.25;
    }
}
