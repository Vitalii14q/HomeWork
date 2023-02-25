package leetcode;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] numbs = {2, 7, 11, 15};
        int target = 9;
        TwoSum twoSum = new TwoSum();
        System.out.println(twoSum.task);
        int[] result = twoSum.twoSum(numbs, target);
        System.out.println("Answer: " + Arrays.toString( result));
        System.out.println(" ");

        PalindromeNumber palindromeNumber = new PalindromeNumber();
        System.out.println(palindromeNumber.task);
        System.out.println("Answer: " + palindromeNumber.isPalindrome(-123));
    }
}
