package collection.arrayList;

import java.util.ArrayList;


/**
 * Напишите программу на Java для вставки некоторых элементов в указанной позиции в связанный список.
 */

public class Task9 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Молоко");
        arrayList.add("Хлеб");
        arrayList.add("Вода");

        arrayList.add(2,"Соль");
        System.out.println(arrayList);
    }
}
