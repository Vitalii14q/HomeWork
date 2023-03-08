package homeWork220927Cycles;

public class Task10 {
    /**
     * Сумма и произведение цифр числа
     */
    public static void main(String[] args) {
        int numbers = 45;
        int sum = 0;
        int product = 1;

        while (numbers > 0) {
            int lastDigit = numbers % 10;
            sum += lastDigit;
            product *= lastDigit;
            numbers /= 10;
        }
        System.out.println(sum + " " + product);
    }
}
