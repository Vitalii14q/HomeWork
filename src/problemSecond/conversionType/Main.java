package problemSecond.conversionType;

/**
 * В Java преобразование типов может быть выполнено с использованием двух подходов:
 * приведение типов (casting) и методы классов оберток.
 */

public class Main {
    public static void main(String[] args) {

        // приведение типов
        int a = 5;
        double b = (double) a; // Оператор приведения типа '(double) a' преобразует значение 'a' в тип double
        System.out.println(a);
        System.out.println(b);
        System.out.println();

        //методы классов оберток
        /**
         * Java также предоставляет классы оберток для каждого из примитивных типов данных.
         * Эти классы обеспечивают доступ к методам и свойствам этих типов данных.
         * Для преобразования значений между примитивными типами данных и их классами обертками используются методы классов оберток.
         */

        String number = "123";
        int num = Integer.parseInt(number); // с помощью метода parseInt мы преобразовываем строчку в цело численное значение
        byte numByte = Byte.parseByte(number);
        short numShort =  Short.parseShort(number);
        long numLong = Long.parseLong(number);
        float numFloat = Float.parseFloat(number);
        double numDouble = Double.parseDouble(number);
        boolean numBoolean = Boolean.parseBoolean(number);
        char c = '1';
        String cString = Character.toString(c); //тут мы преобразовываем символ в строку
        System.out.println(num);
        System.out.println(numByte);
    }
}
