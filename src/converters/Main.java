package converters;

public class Main {
    public static void main(String[] args) {
        ConverterCelsiusЕoFahrenheit converterCelsiusЕoFahrenheit = new ConverterCelsiusЕoFahrenheit();
        System.out.println(converterCelsiusЕoFahrenheit.converter(36));
        ConverterKmToM converterKmToM = new ConverterKmToM();
        System.out.println(converterKmToM.converter(33));
        ConvertHourMinute  convertHourMinute = new ConvertHourMinute();
        System.out.println(convertHourMinute.converter(60));
    }
}
