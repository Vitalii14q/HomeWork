package collection.map;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Даны два списка одинаковой длины. Необходимо создать из них map таким образом, чтобы элементы первого списка были ключами,
 * а элементы второго — соответственно значениями нашего словаря.
 */

public class Task3 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        ArrayList<Integer> arrayList1 = new ArrayList<>();
        arrayList.add("Хлеб");
        arrayList.add("Вода");
        arrayList.add("Соль");
        arrayList1.add(33);
        arrayList1.add(34);
        arrayList1.add(35);

        HashMap <String, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < arrayList.size(); i++){
            hashMap.put(arrayList.get(i), arrayList1.get(i));
        }
        System.out.println(hashMap);
    }
}
