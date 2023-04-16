package Collection.map;

import java.util.HashMap;

/**
 * Создайте map, в котором ключами будут числа от 1 до 10, а значениями эти же числа, возведенные в куб.
 */

public class Task2 {
    public static void main(String[] args) {
        HashMap <Integer, Integer> hashMap = new HashMap<>();
        for (int i = 1; i <= 10; i++) {
            int result = i * i * i;
            hashMap.put(i, result);
        }
        System.out.println(hashMap);
    }
}
