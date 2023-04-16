package collection.arrayList;

import java.util.ArrayList;

/**
 * Напишите Java-программу для итерации связанного списка в обратном порядке.
 */

public class Task4 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Молоко");
        arrayList.add("Хлеб");
        arrayList.add("Вода");
        arrayList.add("Колбаса");
        arrayList.add("Сыр");

        for (int i = arrayList.size() - 1; i >= 0; i--) {
            System.out.println(arrayList.get(i));
        }
    }
}
