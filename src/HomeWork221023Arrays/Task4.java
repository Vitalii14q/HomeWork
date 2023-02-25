package HomeWork221023Arrays;

public class Task4 {
    /**
     * Первый положительный элемент массива
     */
    public static void main(String[] args) {
        int []numbers = {-7, -10, 6, 5, 1};

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > 0) {
                System.out.println("Первый положительный элемент: " + numbers[i]);
                break;
            }
        }
    }
}
