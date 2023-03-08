package homeWork220927Cycles;

public class Task4 {
    /**
     * Составьте таблицу значений функции f(x) = (21 / x + 8) * x
     */
    public static void main(String[] args){
        int a = -10;
        int b = 10;

        int x = a;
        while (x <= b) {
            if (x != 0) {
                int res = (21 / x + 8) * x;
                System.out.println(x + " " + res);
            }
            x++;
        }
    }
}
