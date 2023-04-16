package Collection.ArrayList;

/**
 * Напишите Java-программу для перебора всех элементов в связанном списке.
 */

import java.util.ArrayList;

public class Task2 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Молоко");
        arrayList.add("Хлеб");
        arrayList.add("Вода");
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }
    }
}
