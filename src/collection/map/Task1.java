package collection.map;

import java.util.HashMap;

/**
 * Дан map с числовыми значениями (ключи выбрать любого типа). Необходимо все значения перемножить и вывести на экран.
 */

public class Task1 {
    public static void main(String[] args) {
        HashMap<String, Integer> hashMap =new HashMap<>();
        hashMap.put("Россия", 55);
        hashMap.put("Америка", 44);
        hashMap.put("Германия", 33);
        hashMap.put("Япония", 22);
        hashMap.put("Уругвай", 11);

        int result = 1;

        for (int value :hashMap.values()) {
            result *= value;
        }
        System.out.println(result);
    }
}
