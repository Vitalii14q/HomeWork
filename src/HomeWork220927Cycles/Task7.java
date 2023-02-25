package HomeWork220927Cycles;

public class Task7 {
    /**
     * Вывести на экран цифры числа
     */
    public static void main(String[] args) {
        int number = 123456;

        printNumbers(number);
    }

    static void printNumbers(int number) {
        while (number > 0){
            System.out.println(number % 10);
            number /= 10;
        }
    }
}
