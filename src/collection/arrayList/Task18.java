package collection.arrayList;

import java.util.ArrayList;

/**
 * Напишите программу на Java, чтобы клонировать связанный список в другой связанный список.
 */

public class Task18 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Молоко");
        arrayList.add("Хлеб");
        arrayList.add("Вода");

        ArrayList<String> arrayList1 = (ArrayList<String>) arrayList.clone();

        System.out.println("Список 1: " + arrayList);
        System.out.println("Список 2 (клон): " + arrayList1);
    }
}
