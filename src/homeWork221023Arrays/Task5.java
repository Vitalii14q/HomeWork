package homeWork221023Arrays;

public class Task5 {
    /**
     * Поиск максимального и минимального элемента в массиве
     */
    public static void main(String[] args) {
        int []numbers = {4, 3, 5, 33, 22};

        int max = numbers[0];
        int min = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (max < numbers[i]) {
                max = numbers[i];
            }
            if (min > numbers[i]) {
                min = numbers[i];
            }
        }
        System.out.println("Максимальный элемент: " + max);
        System.out.println("Максимальный элемент: " + min);
    }
}

