package HomeWork221023Arrays;

public class Task2 {
    /**
     * Сумма положительных элементов массива
     */
    public static void main(String[] args) {
        int []numbers = {3,5,-4,-7};

        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > 0) {
                sum += numbers[i];
            }
        }
        System.out.println("Сумма положительных элементов = " + sum);
    }
}

