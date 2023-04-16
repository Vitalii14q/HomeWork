package Collection.ArrayList;

import java.util.ArrayList;

/**
 * Напишите программу на Java для сравнения двух связанных списков.
 */

public class Task24 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Молоко");
        arrayList.add("Хлеб");
        arrayList.add("Вода");

        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("Сыр");
        arrayList1.add("Печень :-D");

        arrayList.equals(arrayList1);
    }
}
