package Converters;

public class ConverterKmToM extends Converter{

    @Override
    public double converter(double km) {
        return km / 3.6;
    }
}
