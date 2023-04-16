package collection.hashSet;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class Main {
    public static void main(String[] args) {
        LinkedHashSet<String> hashSet = new LinkedHashSet<>();
        HashSet<String> hashSet1 = new HashSet<>();
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Молоко");
        arrayList.add("Хлеб");
        arrayList.add("Вода");
        arrayList.add("Колбаса");
        arrayList.add("Сыр");
        arrayList.add("Сыр");
        arrayList.add("Молоко");
        arrayList.add("Хлеб");
        arrayList.add("Вода");
        arrayList.add("Колбаса");
        arrayList.add("Сыр");
        arrayList.add("Сыр");
        System.out.println(arrayList);
        HashSet<String> hashSet2 = new HashSet<>(arrayList);
        System.out.println(hashSet2);


        /*hashSet.add("Хлеб");
        hashSet.add("Молоко");
        hashSet.add("Соль");
        hashSet.add("Соль1");
        hashSet.add("Соль2");
        hashSet.add("Соль3");
        hashSet.add("Соль4");
        hashSet.add("Соль5");
        hashSet1.add("Соль5");
        hashSet1.add("Соль5");

        Iterator<String> iterator = hashSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println(" ");

        for (String s : hashSet) {
            System.out.println(s);
        }
        System.out.println(hashSet.retainAll(hashSet1));

        System.out.println(hashSet);*/
    }
}
