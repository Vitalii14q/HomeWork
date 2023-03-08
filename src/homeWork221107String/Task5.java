package homeWork221107String;

/**
 * Определить, есть ли указанная буква в строке
 */

public class Task5 {
    public static void main(String[] args) {

        System.out.println(searchToLetter("cucumber", 'u'));

    }
    static boolean searchToLetter (String word, char letter) {
        char[] letterArr = word.toCharArray();

        for (int i = 0; i < word.length(); i++) {
            if (letterArr[i] == letter) {
                return true;
            }
        }
        return false;
    }
}
