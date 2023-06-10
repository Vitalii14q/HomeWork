package Thread;

public class Main2 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6,  7, 8, 9, 10};
        SearchMaxElementByBordersThread searchMaxElementByBordersThread = new SearchMaxElementByBordersThread(array, 0,6);
        searchMaxElementByBordersThread.start();
    }
}
