package kata;
/**
 * Вставить цифру в число не прибегая к строковым преобразованиям.
*/

public class Task2 {
    public static void main(String[] args) {
        int num = 1234567;
        int number = 5;
        int position = 3;

        System.out.println(insertDigit(num, number,position));
    }

    static int insertDigit (int num, int digit, int position) {
        int saveDigit = 0;
        int i = 0;

        while (i <= position) {
            saveDigit = insertToEnd(saveDigit, num % 10);
            num /= 10;
            i++;
        }

        num = insertToEnd(num, digit);
        i = 0;
        while (i <= position) {
            num = insertToEnd(num, saveDigit % 10);
            saveDigit /= 10;
            i++;
        }
        return num;
    }

    static int insertToEnd (int num, int digit) {
        return num * 10 + digit;
    }
}
