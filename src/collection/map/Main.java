package collection.map;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Россия", 55000);
        hashMap.put("Америка", 44000);
        hashMap.put("Германия", 33000);
        hashMap.put("Япония", 22000);
        hashMap.put("Уругвай", 11000);

        for (Map.Entry<String, Integer> entry : hashMap.entrySet()){
            System.out.println(entry.getKey());

        }
        System.out.println(hashMap.get("Япония"));
        System.out.println(hashMap);
    }
}
