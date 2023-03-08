package homeWork221107String;

/**
 * Даны две строки. Определить какая строка длиннее и вывести ее на экран
 */


public class Task3 {
    public static void main(String[] args) {


        compare("hello world", "line2");
    }

    static void compare(String line, String line2) {
        int lineLength = line.length();
        int lineLength2 = line2.length();
        if (lineLength > lineLength2) {
            System.out.println(line);
        } else {
            System.out.println(line2);
        }
    }
}
