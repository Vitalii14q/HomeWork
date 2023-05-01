package collection.arrayList;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Напишите программу на Java, чтобы перемешать элементы в связанном списке.
 */

public class Task16 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Молоко");
        arrayList.add("Хлеб");
        arrayList.add("Вода");

        System.out.println("Исходный список: " + arrayList);
        Collections.shuffle(arrayList);
        System.out.println("Перемешанный список: " + arrayList);
    }
}
