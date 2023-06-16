package Thread;

import java.util.ArrayList;
import java.util.List;

public class NewClass {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(4);
        list.add(6);
        System.out.println(list);

        for (int i = 0; i < list.size(); i++) {
            int item = list.get(i);
            System.out.println(item) ;
        }
        System.out.println(" ");

        for (int i = 0; i < list.size(); i++) {
            System.out.println(i);
        }
    }
}
