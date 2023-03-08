package homeWork220927Cycles;

public class Task18 {
    /**
     * Найти совершенные числа
     */
    public static void main(String[] args) {
        int number = 500;

        for (int i = 1; i < number; i++) {
            int sum = 0;
            for (int j = 1; j < i; j++) {
                if (i % j == 0) {
                    sum += j;
                }
            }
            if (sum == i) {
                System.out.println(sum);
            }

        }
    }
}

