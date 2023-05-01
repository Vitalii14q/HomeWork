package collection.arrayList;

import java.util.ArrayList;

/**
 * Напишите Java-программу для удаления и возврата первого элемента связанного списка.
 */

public class Task19 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Молоко");
        arrayList.add("Хлеб");
        arrayList.add("Вода");

        String firstElement = arrayList.remove(0);

        System.out.println("Удаленный первый элемент: " + firstElement);
        System.out.println("Оставшиеся элементы списка: " + arrayList);
    }
}
