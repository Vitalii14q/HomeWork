package homeWork220927Cycles;

public class Task12 {
    /**
     * Сумма первой и последней цифр числа
     */
    public static void main(String[] args) {
        int number = 1223;


        System.out.println(getFirstDigit(number) + getLastDigit(number));
    }

    static int getLastDigit(int number) {
        return number % 10;
    }

    static int getFirstDigit(int number) {

        int digitCounter = getCountDigit(number);
        int i = 0;
        int firstDigit = number;
        while (i < digitCounter - 1) {
            firstDigit /= 10;
            i++;
        }
        return firstDigit;
    }

    static int getCountDigit (int number) {
        int digitCounter = 0;
        while (number > 0) {
            digitCounter++;
            number /= 10;
        }
        return digitCounter;
    }
}

