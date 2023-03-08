package homeWork221023Arrays;

public class Task17 {
    /**
     * Самая длинная последовательность, состоящая из одинаковых
     * элементов
     */
    public static void main(String[] args) {
        int []numbers = {3, 3, 3, 2, 2, 2, 2, 2, 1};

        int currentCount = 1;
        int currentElement = numbers[0];
        int maxCount = 1;
        int maxElement = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] == numbers[i-1]) {
                currentCount++;

            } else {
                if (currentCount > maxCount) {
                    maxCount = currentCount;
                    maxElement = currentElement;
                }
                currentElement = numbers[i];
                currentCount = 1;
            }
        }
        if (currentCount > maxCount) {
            maxCount = currentCount;
            maxElement = currentElement;
        }
        System.out.println("Длинна максимальной последовательности: " + maxCount + " " + "Элемент этой последовательности" + " " + maxElement);
    }
}
