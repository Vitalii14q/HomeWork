package collection.arrayList;

import java.util.ArrayList;

/**
 * Напишите программу на Java для удаления первого и последнего элемента из связанного списка.
 */

public class Task13 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Молоко");
        arrayList.add("Хлеб");
        arrayList.add("Вода");
        System.out.println(removeFirst(arrayList));
        System.out.println(removeLast(arrayList));
    }

    public static String removeFirst (ArrayList<String> arrayList) {
        return arrayList.remove(0);
    }

    public static String removeLast (ArrayList<String> arrayList) {

        return arrayList.remove(arrayList.size() - 1);
    }
}
