package HomeWork220927Cycles;

public class Task5 {
    /**
     * Вычисление факториала числа
     */
    public static void main(String[] args) {

        int n = 5;

        System.out.println(factorial(n));

    }

    static int factorial(int number) {

        int res = 1;
        while (number != 0) {
            res *= number;
            number--;
        }
        return res;
    }
}
