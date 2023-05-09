package linkedList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Произвести сортировку массива
 */

public class Task2 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);
        arrayList.add(6);
        arrayList.add(7);
        arrayList.add(8);
        arrayList.add(9);

        List<Integer> numbersSorted = arrayList.stream() // Метод Arrays.stream() - это статический метод из класса Arrays, который преобразует массив в поток элементов, которые можно обрабатывать с помощью методов потоков Java.
                .sorted(new ReverseComparator()) //  Метод sorted() сортирует элементы по возрастанию
                .collect(Collectors.toList()); // Преобразует отсортированные элементы обратно в массив.

        System.out.println(numbersSorted);

        List<Integer> numbersSorted2 = arrayList.stream() // Метод Arrays.stream() - это статический метод из класса Arrays, который преобразует массив в поток элементов, которые можно обрабатывать с помощью методов потоков Java.
                .sorted((number, number2) -> {
                    if (number < number2) {
                        return 1;
                    } else if (number > number2) {
                        return -1;
                    } else {
                        return 0;
                    }
                }) //  Метод sorted() сортирует элементы по возрастанию
                .collect(Collectors.toList()); // Преобразует отсортированные элементы обратно в массив.

        System.out.println(numbersSorted2);
    }
}
