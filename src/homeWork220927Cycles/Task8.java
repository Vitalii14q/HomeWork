package homeWork220927Cycles;

public class Task8 {
    /**
     * Найти сумму четных цифр числа
     */
    public static void main(String[] args) {
        int number = 123456;
        int sum = 0;

        while (number > 0){
            int lastDigit = number % 10;
            if (lastDigit % 2 == 0){
                System.out.println(lastDigit);
                sum += lastDigit;
            }
            number /= 10;
        }
        System.out.println("сумма четных чисел =" + sum);
    }
}
