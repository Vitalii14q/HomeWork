package linkedList;

import java.util.Arrays;

/**
 * Убрать из массива повторяющиеся элементы
 */

public class Task4 {
    public static void main(String[] args) {
        Integer[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10};

        Integer[] removeDuplication = Arrays.stream(numbers) // // создание потока элементов из массива "numbers" с помощью метода "stream" класса "Arrays".
                .distinct() // промежуточная операция потока, которая удаляет все повторяющиеся элементы.
                .toArray(size -> new Integer[size]); // промежуточная операция потока, которая преобразует поток элементов в массив, используя конструктор "new Integer[size]" для создания нового массива нужного размера.

        System.out.println(Arrays.toString(removeDuplication));
    }
}
