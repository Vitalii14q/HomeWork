package collection.arrayList;

import java.util.ArrayList;

/**
 * Напишите программу на Java, чтобы объединить два связанных списка.
 */

public class Task17 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Молоко");
        arrayList.add("Хлеб");
        arrayList.add("Вода");

        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("Сыр");
        arrayList1.add("Печень :-D");

        ArrayList<String> arrayList2 = new ArrayList<>();
        arrayList2.addAll(arrayList);
        arrayList2.addAll(arrayList1);
        System.out.println(arrayList2);
    }
}
