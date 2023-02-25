package HomeWork220927Cycles;

public class Task16 {
    /**
     * Определить количество простых чисел
     */
    public static void main(String[] args) {
        int maxPrimeNumber = 10;

        int counter = 0;
        for (int i = 2; i < maxPrimeNumber; i++) {
            if (isPrime(i)) {
                counter++;
            }

        }
        System.out.println(counter);
    }

    static boolean isPrime(int number) {
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
