package collection.arrayList;

import java.util.ArrayList;

/**
 * Напишите Java-программу для отображения элементов и их позиций в связанном списке.
 */

public class Task11 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Молоко");
        arrayList.add("Хлеб");
        arrayList.add("Вода");
        printIndexAndElement(arrayList);
    }

    public static void printIndexAndElement (ArrayList<String> arrayList) {
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println("index" + " " + i + " " + arrayList.get(i));
        }
    }
}
