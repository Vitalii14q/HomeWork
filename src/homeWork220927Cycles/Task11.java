package homeWork220927Cycles;

public class Task11 {
    /**
     * Определить, какая цифра числа больше
     */
    public static void main(String[] args) {
        int number = 123456;
        int numberMax = -1;
        while (number > 0) {
            int lastDigit = number % 10;
            if (lastDigit > numberMax) {
                numberMax = lastDigit;
            }
            number /= 10;
        }
        System.out.println(numberMax);
    }
}
