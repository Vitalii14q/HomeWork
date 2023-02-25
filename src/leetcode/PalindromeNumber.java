package leetcode;

public class PalindromeNumber {
    String task = "\n" +
            "Учитывая целое число x, вернуть, true если x это\n" +
            "палиндром, и false в противном случае.";

    public boolean isPalindrome(int x) {
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }
        int originalNumbers = x;
        int revers = 0;
        while (x != 0) {
            int digit = x % 10;
            revers = revers * 10 + digit;
            x /= 10;
        }
        if (originalNumbers == revers) {
            return true;
        } else {
            return false;
        }
    }
}

