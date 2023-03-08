package homeWork220927Cycles;

import java.util.Scanner;

public class Task20 {
    /**
     * Задано число. Найти все наборы чисел, которые дают это число при
     * умножении
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input:");
        int number = scanner.nextInt();

        int counter = 0;
        for (int i = 1; i <= number; i++) {
            for (int j = i; j < number; j++) {
                for (int k = j; k < number; k++) {
                    counter++;
                    if (i * j * k == number) {
                        System.out.println(i + " " + j + " " + k);
                    }

                }
            }
        }
        System.out.println(counter);
    }
}
