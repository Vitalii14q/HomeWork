package HomeWork221107String;

/**
 * Реализовать метод для инверсии строки
 */

public class Task6 {
    public static void main(String[] args) {

        System.out.println(reversString("revers"));
    }

    static String reversString(String string) {
        String res = "";
        for (int i = 0; i < string.length(); i++) {
            res = findChar(string, i) + res;
        }
        return res;
    }

    static char findChar (String word, int letter) {
        char[] letterArr = word.toCharArray();
        return letterArr[letter];
    }
}
