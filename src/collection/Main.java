package collection;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(55);
        arrayList.add(54);
        arrayList.add(52);
        System.out.println(arrayList);
        System.out.println(arrayList.get(2));
        Integer test = 55;
        arrayList.remove(test);
        arrayList.contains(55);
    }
}
