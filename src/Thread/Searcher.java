package Thread;

import java.util.ArrayList;
import java.util.List;

public class Searcher {
    private static final int COUNT_OF_THREADS = 7;



    public static int searchMaxElement(List<Integer> list) {
        List<SearchMaxElementByBordersThread> threads = createThreads(list);
            int maxElement = Integer.MIN_VALUE;

            for (SearchMaxElementByBordersThread thread : threads){
                thread.start();
            }

            for (SearchMaxElementByBordersThread thread : threads) {

                try {
                    thread.join(); // метод, который может быть использован для того, чтобы приостановить выполнение текущего потока до тех пор, пока другой поток не закончит свое выполнение
                } catch (InterruptedException e) {
                    System.out.println("Время ожидания истекло");
                }
                int ThreadMaxElement = thread.getMaxElement();

                if (ThreadMaxElement > maxElement) {
                    maxElement = ThreadMaxElement;
                }
            }

        return maxElement;
    }

    private static List<SearchMaxElementByBordersThread> createThreads (List<Integer> list) {
        List<SearchMaxElementByBordersThread> threads = new ArrayList<>();


        int step = list.size() / COUNT_OF_THREADS;

        int currentIndex = 0;
        for(int i = 0; i < COUNT_OF_THREADS - 1; i++) {
            int startIndex = currentIndex;
            currentIndex += step;
            int endIndex = currentIndex - 1;
            SearchMaxElementByBordersThread searchMaxElementByBordersThread = new SearchMaxElementByBordersThread(list, startIndex, endIndex);
            threads.add(searchMaxElementByBordersThread);
            //System.out.println(startIndex + " " + endIndex);
        }

        int startIndex = currentIndex;
        currentIndex = list.size() - 1;
        int endIndex = currentIndex;
        SearchMaxElementByBordersThread searchMaxElementByBordersThread = new SearchMaxElementByBordersThread(list, startIndex, endIndex);
        threads.add(searchMaxElementByBordersThread);
        //System.out.println(startIndex + " " + endIndex);

        return threads;
    }
}
