package collection.arrayList;

import java.util.ArrayList;

/**
 * Напишите Java-программу для вставки указанного элемента в конец связанного списка.
 */

public class Task8 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Молоко");
        arrayList.add("Хлеб");
        arrayList.add("Вода");

        String lostElement = "Свекла";
        arrayList.add(lostElement);

        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }
    }
}
