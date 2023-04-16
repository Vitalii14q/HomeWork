package problemSecond.currencyConverter;

public class DollarToLira extends CurrencyConverter{

    @Override
    public double converter(double dollar) {
        return dollar * 19.05;
    }
}
