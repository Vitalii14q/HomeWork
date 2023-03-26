package problemSecond.CurrencyConverter;

import sun.util.resources.cldr.ar.CalendarData_ar_QA;

public class Main {
    public static void main(String[] args) {

        DollarToRuble dollarToRuble = new DollarToRuble();
        System.out.println("Доллар к рубль : " + dollarToRuble.converter(1));
        System.out.println(" ");
        DollarToLira dollarToLira = new DollarToLira();
        System.out.println("Доллар к лире: " + dollarToLira.converter(5));
        System.out.println(" ");
        RubleToDollar rubleToDollar = new RubleToDollar();
        System.out.println("Рубль к доллару : " + rubleToDollar.converter(500));
        System.out.println(" ");
        RubleToLira rubleToLira = new RubleToLira();
        System.out.println("Рубль к лире: " + rubleToLira.converter(100));
        System.out.println(" ");
        LiraToDollar liraToDollar = new LiraToDollar();
        System.out.println("Лира к доллару: " + liraToDollar.converter(50));
        System.out.println(" ");
        LiraToRuble liraToRuble = new LiraToRuble();
        System.out.println("Лира к рублю: " + liraToRuble.converter(100));
        CurrencyConverter currencyConverter = new DollarToLira();
        System.out.println(currencyConverter.converter(100));
        CurrencyConverter[] currencyConverters = new CurrencyConverter[5];
        currencyConverters[0] = dollarToLira;
        currencyConverters[1] = dollarToRuble;

    }
}
