package HomeWork220927Cycles;

public class Task15 {
    /**
     * Удалить цифру из числа
     */
    public static void main(String[] args) {
        int number = 1234333333;
        int del = 3;

        int multiplication = 1;
        int res = 0;
        while (number > 0) {
            int digit = number % 10;

            if (del != digit) {
                res += digit * multiplication;
                multiplication *= 10;

            }
            number /= 10;
        }
        System.out.println(res);
    }
}
