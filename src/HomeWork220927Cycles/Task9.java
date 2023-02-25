package HomeWork220927Cycles;

public class Task9 {
    /**
     * Посчитать четные и нечетные цифры числа
     */
    public static void main(String[] args) {
        int number = 123456;
        int even = 0;
        int odd = 0;

        while (number > 0) {
            if (number % 2 == 0){
                even++;
            } else {
                odd++;
            }
            number /= 10;
        }
        System.out.println("четные " + even + " нечетные " + odd);
    }
}
