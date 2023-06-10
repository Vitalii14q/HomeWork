package Thread;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Thread> threadList = new ArrayList<>();
        for (int i = 0; i < 500; i++) {
            ThreadKiller threadKiller1 = new ThreadKiller();
            threadKiller1.setPriority(10);
            threadList.add(threadKiller1);
        }
        for (int i = 0; i < threadList.size(); i++) {
            threadList.get(i).start();

        }
    }
}
