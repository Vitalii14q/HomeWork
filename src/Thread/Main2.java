package Thread;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main2 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6,  7, 8, 9, 10};
        /*SearchMaxElementByBordersThread searchMaxElementByBordersThread = new SearchMaxElementByBordersThread(array, 0,6);
        searchMaxElementByBordersThread.start();*/
        List<Integer> list = new LinkedList<>();
        System.out.println("Начало заполнения массива");
        for (int i = 0; i < 200000; i++){
            list.add(0,i);
        }
        System.out.println("Конец заполнения массива");
        System.out.println("Начало поиска");
        System.out.println(Searcher.searchMaxElement(list));
        System.out.println("Конец поиска");
    }
}
