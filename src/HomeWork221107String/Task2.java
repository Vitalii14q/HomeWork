package HomeWork221107String;

/**
 *Вывести все буквы из слова в столбец
 */


public class Task2 {
    public static void main(String[] args) {


        printAllChar("line");
    }
    static void printAllChar(String line) {

        for (int i = 0; i < line.length(); i++) {
            System.out.println(line.charAt(i));
        }
    }
}
