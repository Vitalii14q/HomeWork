package Collection.ArrayList;

import java.util.ArrayList;

/**
 * Напишите программу на Java, чтобы проверить, существует ли определенный элемент в связанном списке.
 */

public class Task22 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Молоко");
        arrayList.add("Хлеб");
        arrayList.add("Вода");
        if (arrayList.contains("Молоко")) {
            System.out.println("Содержаться ");
        } else {
            System.out.println("увы");
        }
    }
}
