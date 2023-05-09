package linkedList;

import java.util.Arrays;

/**
 * Найти максимальный элемент массива
 */

public class Task7 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7 ,8, 8};
        int maxNumber = Arrays.stream(numbers)
                .max()
                .orElse(-1);

        System.out.println(maxNumber);
    }
}
