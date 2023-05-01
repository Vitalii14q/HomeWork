package collection.arrayList;

import java.util.ArrayList;

/**
 * Напишите программу на Java, чтобы получить первое и последнее вхождение указанных элементов в связанный список.
 */

public class Task10 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Молоко");
        arrayList.add("Хлеб");
        arrayList.add("Вода");
        System.out.println(getFirst(arrayList) + " " + getLast(arrayList));
    }

    public static String getFirst (ArrayList<String> arrayList) {
       return arrayList.get(0);
    }

    public static String getLast (ArrayList<String> arrayList) {
        return arrayList.get(arrayList.size() - 1);
    }
}
