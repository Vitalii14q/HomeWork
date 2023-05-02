package linkedList;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Найти количество четных чисел в LinkedList
 */

public class Task1 {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList =new LinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        linkedList.add(5);
        linkedList.add(6);

        List<Integer> result = linkedList.stream()
                .filter(number -> number % 2 == 0)
                .collect(Collectors.toList());
        System.out.println(result);
    }
}
