package problemSecond.currencyConverter;

public class DollarToRuble extends CurrencyConverter{

    @Override
    public double converter(double dollars) {
        return dollars * 76.96; // хотелось бы конечно чтобы это все обновлялось перед каждой итерацией.
    }
}
