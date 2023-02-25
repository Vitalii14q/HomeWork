package HomeWork221023Arrays;


import java.util.Arrays;

public class Task11 {
    /**
     * Поменять местами минимальный и максимальный элементы
     * массива
     */
    public static void main(String[] args) {

        int []numbers = {-400, -525, 5, 6, 500};

        int minElement = numbers[0];
        int minIndex = 0;
        int maxElement = numbers[0];
        int maxIndex = 0;
        for (int i = 0; i < numbers.length; i++) {
            int currentElement = numbers[i];

            if (currentElement < minElement){
                minElement = currentElement;
                minIndex = i;
            }

            if (currentElement > maxElement){
                maxElement = currentElement;
                maxIndex = i;

            }
        }
        int changeElements = numbers[maxIndex];
        numbers[maxIndex] = numbers[minIndex];
        numbers[minIndex] = changeElements;
        System.out.println(Arrays.toString(numbers));
    }
}

