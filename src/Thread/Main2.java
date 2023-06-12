package Thread;

import java.util.ArrayList;
import java.util.List;

public class Main2 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6,  7, 8, 9, 10};
        /*SearchMaxElementByBordersThread searchMaxElementByBordersThread = new SearchMaxElementByBordersThread(array, 0,6);
        searchMaxElementByBordersThread.start();*/
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(12);
        list.add(13);
        list.add(13);
        list.add(13);
        list.add(1);
        list.add(12);
        list.add(13);
        list.add(13);
        list.add(13);
        list.add(13);

        Searcher.getMaxElement(list);
    }
}
