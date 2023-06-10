package Thread;

public class SearchMaxElementByBordersThread extends Thread{
    private int[] array;
    private int start;
    private int end;

    public SearchMaxElementByBordersThread(int[] array, int start, int end) {
        this.array = array;
        this.start = start;
        this.end = end;
    }


    @Override
    public void run() {
        System.out.println(array + " " + start + " " + end);
    }

}
