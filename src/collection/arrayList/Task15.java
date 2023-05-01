package collection.arrayList;

import java.util.ArrayList;

/**
 * Напишите программу на Java, которая поменяет два элемента в связанном списке.
 */

public class Task15 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Молоко");
        arrayList.add("Хлеб");
        arrayList.add("Вода");

        swap(arrayList, 0, 2);
        System.out.println(arrayList);
    }

    public static void swap(ArrayList<String> arrayList, int indexFirst, int indexSecond) {
        String buffer = arrayList.get(indexFirst);
        arrayList.set(indexFirst, arrayList.get(indexSecond));
        arrayList.set(indexSecond,  buffer);
    }
}
