package homeWork221107String;

/**
 *Реализовать метод, который принимает два параметра: строку и
 *номер буквы из этой строки. Метод должен вывести на экран эту букву
*/

public class Task1 {
    public static void main(String[] args) {

        printChar(5, "new String()");
    }

    static void printChar(int number, String line) {
        System.out.println(line.charAt(number));
    }
}
