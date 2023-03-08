package converters;

public class ConvertHourMinute extends Converter{

    @Override
    public double converter(double hour) {
        return hour * 3600;
    }
}

