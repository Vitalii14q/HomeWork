package HomeWork221107String;

/**
 * Реализовать метод, который принимает в качестве входных параметров две
 * строки и возвращает новую строку, которая является склейкой переданных слов
 */

public class Task4 {
    public static void main(String[] args) {

        System.out.println(glueStrings("Меня зовут ", "я живу в городе "));
    }

    static String glueStrings(String line, String line2) {
        String res = line + line2;
        return res;
    }
}
