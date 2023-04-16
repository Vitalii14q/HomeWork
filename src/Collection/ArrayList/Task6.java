package Collection.ArrayList;

import java.util.ArrayList;

/**
 * Напишите программу на Java для вставки элементов в связанный список в первой и последней позиции.
 */

public class Task6 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Молоко");
        arrayList.add("Хлеб");
        arrayList.add("Вода");

        String firstElement = "Чай";
        arrayList.add(0,firstElement);

        String lostElement = "Свекла";
        arrayList.add(lostElement);

        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }
    }
}
