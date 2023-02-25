package HomeWork220927Cycles;


import java.util.Scanner;

public class Task21 {
    /**
     * Реализовать программу "Угадай число"
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.print("Вы попали в игру угадай число, введите число от 0 до 10: ");

        int numberOfAttempts = 3;
        int maxNumber = 11;
        int randomNumber = (int) (Math.random() * maxNumber);
        for (int i = 0; i < numberOfAttempts; i++) {
            System.out.print("Введите число: ");
            int input = scanner.nextInt();

            if (input < randomNumber){
                System.out.println("Вы не угодали, число больще");
            }
            if (input > randomNumber) {
                System.out.println("Вы не угодали, число меньше");
            }
            else if (input == randomNumber) {
                System.out.println("Вы Угадали");
                break;
            }
        }
    }
}




