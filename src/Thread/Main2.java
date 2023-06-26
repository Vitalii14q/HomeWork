package Thread;

import objectOop.Timer;

import java.util.LinkedList;
import java.util.List;

public class Main2 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Timer timer = new Timer();
        List<Integer> list = new LinkedList<>();
        System.out.println("Начало заполнения массива");
        for (int i = 0; i < 200000; i++) {
            list.add(0, i);
        }
        System.out.println("Конец заполнения массива");
        System.out.println("Начало поиска");
        timer.start();
        System.out.println(Searcher.searchMaxElement(list));
        timer.stop();
        System.out.println("Конец поиска " + timer.getTime('o'));
    }
}
