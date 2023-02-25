package HomeWork221023Arrays;

public class Task12 {
    /**
     * Найти количество положительных элементов массива
     */
    public static void main(String[] args) {
        int[] numbers = {-1, -4, 5, 7, -4};

        int counter = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > 0) {
                counter++;

            }
        }

        System.out.println(counter);
    }
}


