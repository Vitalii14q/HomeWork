package problemSecond.CurrencyConverter;

public class LiraToRuble extends CurrencyConverter{

    @Override
    public double converter(double lira) {
        return lira * 3.99;
    }
}
