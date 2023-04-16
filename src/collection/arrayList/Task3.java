package collection.arrayList;

import java.util.ArrayList;

/**
 * Напишите Java-программу для итерации по всем элементам в связанном списке, начиная с указанной позиции.
 */

public class Task3 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Молоко");
        arrayList.add("Хлеб");
        arrayList.add("Вода");
        arrayList.add("Колбаса");
        arrayList.add("Сыр");

        int startIndex = 2;

        for (int i = startIndex; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }
    }
}
