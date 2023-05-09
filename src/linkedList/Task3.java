package linkedList;

import java.util.Arrays;

/**
 * Выводить элементы массива, пока числа четные
 */

public class Task3 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        Arrays.stream(numbers) // Преобразование массива в поток элементов.
                .filter(n -> n % 2 == 0) // фильтрация потока данных, оставляющая только элементы, которые делятся на 2 без остатка с помощью лямбда выражения.
                .forEach(number -> System.out.println(number)); // Здесь используется лямбда-выражение для передачи операции вывода System.out.println() в качестве аргумента метода forEach().
    }
}

