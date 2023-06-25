package problemTherd;

public class Main {
    public static void main(String[] args) {
        double temperature = 23.5;

        CelsiusConverter celsiusConverter = new CelsiusConverter();
        System.out.println("t = " +
                celsiusConverter.getConvertedValue(temperature) + " t = 2 \" " + celsiusConverter.getConvertedValue(temperature));



    }
}
