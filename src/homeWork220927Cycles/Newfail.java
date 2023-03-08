package homeWork220927Cycles;

public class Newfail {
    public static void main(String[] args) {
        int number = 500;

        int i = 0;
        while (i < 2) {
            number /= 10;
            i++;
        }
        System.out.println(number);
    }
}
