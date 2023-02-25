package HomeWork220927Cycles;

public class Task14 {
    /**
     * Найти одинаковые цифры двух чисел
     */
    public static void main(String[] args) {
        int firstNumber = 5554;
        int secondNumber = 4321;

        int firstNumberCopy = firstNumber;
        while (firstNumberCopy > 0) {
            int lastDigit = firstNumberCopy % 10;
            int secondNUmberCopy = secondNumber;

            while (secondNUmberCopy > 0) {
                int secondLastDigit = secondNUmberCopy % 10;

                if (secondLastDigit == lastDigit) {
                    System.out.println(secondLastDigit);
                }
                secondNUmberCopy /= 10;
            }
            firstNumberCopy /= 10;
        }
    }
}
