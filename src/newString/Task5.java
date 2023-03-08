package newString;

/**
 * Определить, есть ли указанная буква в строке
 */

public class Task5 {
    public static void main(String[] args) {

        System.out.println(search("hello", 'l'));

    }

    public static boolean mSearch (String word, char letter) {
        for (int i = 0; i < word.length(); i++) {
            if (i <= word.indexOf(letter)) {
                return true;
            }
        }
        return false;
    }

    public static boolean search (String word, char letter) {
        for (int i = 0; i < word.length(); i++) {
            if (letter == word.charAt(i)) {
                return true;
            }
        }
        return false;
    }
}
