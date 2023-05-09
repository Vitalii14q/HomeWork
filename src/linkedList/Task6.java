package linkedList;

import java.util.Arrays;

/**
 * Есть ли в массиве числа, которые состоят из 3 цифр
 */

public class Task6 {
    public static void main(String[] args) {
        int[] numbers = {999, 29, 30};

        boolean hasThreeDigitNumbers = Arrays.stream(numbers) // Массив numbers преобразуется в поток элементов с помощью метода Arrays.stream().
                .anyMatch(n -> 100 <= n && n <= 999); // Метод anyMatch() возвращает true, если хотя бы один элемент потока соответствует условию. Если в потоке есть хотя бы одно число из трех цифр, то hasThreeDigitNumbers будет равно true, иначе - false.

        System.out.println(hasThreeDigitNumbers);

    }
}
