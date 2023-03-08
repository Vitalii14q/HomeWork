package homeWork221023Arrays;

import java.util.Arrays;

public class Task20 {
    /**
     * Удаление элементов одномерного массива
     */
    public static void main(String[] args) {
        int []numbers = {1, 2, 3, 4, 3, 4, 6};
        int indexDel = 6;

        int []numbersNew = new int [numbers.length - 1];
        for (int i = 0; i < indexDel; i++) {
            numbersNew[i] = numbers[i];
        }
        for (int i = indexDel + 1; i < numbers.length; i++) {
            numbersNew[i-1] = numbers[i];

        }
        System.out.println(Arrays.toString(numbersNew));
    }
}
