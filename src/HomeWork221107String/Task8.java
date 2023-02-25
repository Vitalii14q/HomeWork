package HomeWork221107String;

/**
 * В заданной строке необходимо разделить все буквы дефисом.
 * Результат записать в новую строку
 */

public class Task8 {
    public static void main(String[] args) {

        splitTheString("Привет");

    }

    static void splitTheString(String textForSplit) {
        int lastIndex= textForSplit.length() - 1;

        for (int i = 0; i < textForSplit.length(); i++) {
            System.out.print(textForSplit.charAt(i));  //ставим текущий символ
            if (i < lastIndex) { //
                System.out.print("-");

            }
        }
    }
}
