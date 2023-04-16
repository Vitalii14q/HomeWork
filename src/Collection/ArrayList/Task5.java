package Collection.ArrayList;

import java.util.ArrayList;

/**
 * Напишите Java-программу для вставки указанного элемента в указанную позицию в связанном списке.
 */

public class Task5 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Молоко");
        arrayList.add("Хлеб");
        arrayList.add("Вода");

        int pastIndex = 3;
        String pastElement = "Томат";
        arrayList.add(pastIndex, pastElement);

        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }
    }
}
