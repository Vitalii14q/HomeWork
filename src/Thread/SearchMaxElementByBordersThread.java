package Thread;

import java.util.List;

public class SearchMaxElementByBordersThread extends Thread{
    private final List<Integer> list;
    private final int start;
    private final int end;

    private Integer maxElement;

    public SearchMaxElementByBordersThread(List<Integer> list, int start, int end) {
        this.list = list;
        this.start = start;
        this.end = end;
    }

    public int getMaxElement() {
        if (maxElement == null) {
            throw new IllegalArgumentException("Поток в процессе поиска максимального элемента");
        }
        return maxElement;
    }
    @Override
    public void run() {
        int maxElement = list.get(start);
        for (int i = start + 1; i <= end; i++) {
            if (list.get(i) > maxElement) {
                maxElement = list.get(i);
            }
        }
        this.maxElement = maxElement;
    }
}
