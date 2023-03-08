package newArrays;

public class Task7 {
    /**
     * Найти два максимальных элемента массива
     */
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6};

        int firstMaxElement = numbers[0];
        int secondMaxElement = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (firstMaxElement < numbers[i]) {
                firstMaxElement = numbers[i];
            }
        }
    }
}
