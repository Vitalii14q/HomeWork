package homeWork220927Cycles;

public class Task13 {
    /**
     * Осуществить переворот числа
     */
    public static void main(String[] args) {
        int number = 123;

        int counter = 0;
        int numberCopy = number;
        while (numberCopy > 0) {
            counter++;
            numberCopy /= 10;
        }

        int multiplication = 1;
        for (int i = 0; i < counter -1; i++) {
            multiplication *= 10;
        }
        int res = 0;
        while (number > 0) {
            int digit = number % 10;

            res += digit * multiplication;
            multiplication /= 10;
            number /= 10;
        }

        System.out.println(res);
    }
}
