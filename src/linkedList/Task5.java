package linkedList;

import java.util.Arrays;

/**
 * Вывести из массива первые 10 элементов
 */

public class Task5 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};

        Arrays.stream(numbers)
                .limit(10)// Этот метод создает поток элементов из массива numbers. Аргументы 0 и 10 определяют диапазон индексов массива, который будет использоваться.
                .forEach(element -> System.out.println(element)); // Мы используем лямбда-выражение element -> System.out.println(element), которое просто печатает каждый элемент в консоль

    }
}
