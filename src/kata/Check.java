package kata;

import ObjectOop.Timer;

public class Check {
    public static void main(String[] args) {
        Timer timer = new Timer();
        timer.start();
        for (int i = 1; i <= 3000; i++) {
            for (int k = i + 1; k <= 3000; k++) {
                int sumI = getSumOfDivs(i);
                int sumK = getSumOfDivs(k);
                if ( sumI == k && i == sumK){
                    System.out.println(sumI + " " + sumK);
                }
            }
        }
        timer.stop();
        System.out.println("Time = " + timer.getTime(' '));
    }

    static int getSumOfDivs(int i){
        int sum = 0;
        for (int a = 1; a < i; a++){
            if (i % a == 0) {
                sum += a;
            }
        }
        return sum;
    }
}
