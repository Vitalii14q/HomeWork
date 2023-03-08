package converters;

public class ConverterCelsiusЕoFahrenheit extends Converter{

    @Override
    public double converter(double celsius) {
        return (celsius * 9/5) + 32;
    }
}
