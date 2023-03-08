package homeWork221023Arrays;

public class Task13 {
    /**
     * Количества отрицательных и положительных элементов в массиве
     */
    public static void main(String[] args) {
        int []numbers = {-4, -4, 5, 7, -3};

        int positiveElements = 0;
        int negativeElements = 0;
        for (int i = 0; i < numbers.length; i++) {
            if ( numbers[i] > 0) {
                positiveElements++;
            }
            if (numbers[i] < 0) {
                negativeElements++;
            }
        }
        System.out.println(positiveElements + " " + negativeElements);
    }
}

