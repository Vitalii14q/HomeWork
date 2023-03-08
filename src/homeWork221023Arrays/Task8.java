package homeWork221023Arrays;

import java.util.Arrays;

public class Task8 {
    /**
     * Заменить элементы массива на противоположные
     */
    public static void main(String[] args) {
        int[] numbers = {-1, -2, 3, 4, 5};

        elementReplacement(numbers);
        System.out.println(Arrays.toString(numbers));
    }

    static void elementReplacement(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = -numbers[i];
        }
    }
}

