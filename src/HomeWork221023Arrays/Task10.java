package HomeWork221023Arrays;

public class Task10 {
    /**
     * Найти разность между максимальным и минимальным элементами
     * массива
     */
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};

        System.out.println(isMaxElement(numbers) - isMinNumber(numbers));
    }

    static int isMaxElement(int []numbers) {
        int maxNumber = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (maxNumber < numbers[i]) {
                maxNumber = numbers[i];

            }
        }
        return maxNumber;
    }

    static int isMinNumber(int []numbers) {
        int minNumber = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (minNumber > numbers[i]) {
                minNumber = numbers[i];
            }
        }
        return minNumber;
    }
}
