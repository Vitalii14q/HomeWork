package Thread;

import java.util.List;

public class Searcher {
    private static final int COUNT_OF_THREADS = 7;

    public static int getMaxElement(List<Integer> list) {
        int countForAThread = (int) Math.ceil(list.size() * 1.0 / COUNT_OF_THREADS);
        return 0;
    }
}
