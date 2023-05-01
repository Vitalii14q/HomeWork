package collection.arrayList;

import java.util.ArrayList;

/**
 * Напишите Java-программу для извлечения, но не удаления, первого элемента связанного списка.
 */

public class Task20 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Молоко");
        arrayList.add("Хлеб");
        arrayList.add("Вода");

        String firstElement = arrayList.get(0);
        System.out.println("Первый элемент списка: " + firstElement);
    }
}
