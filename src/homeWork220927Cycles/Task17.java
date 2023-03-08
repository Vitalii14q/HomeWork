package homeWork220927Cycles;

public class Task17 {
    /**
     * Вывести делители чисел
     */
    public static void main(String[] args) {
        int number = 28;

        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                System.out.println(i);

                }
        }
    }
}




