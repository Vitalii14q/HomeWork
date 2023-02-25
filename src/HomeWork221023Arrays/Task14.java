package HomeWork221023Arrays;

public class Task14 {
    /**
     * Вывести элементы массива, которые больше среднего
     * арифметического
     */
    public static void main(String[] args) {
        double []numbers = new double[100000];

        findElementsGreaterThanTheArithmeticMean(numbers);
    }

    static double sumNumberArr(double numbers[]) {

        double sumNUmber = 0;
        for (int i = 0; i < numbers.length; i++) {
            sumNUmber += numbers[i];
        }
        return sumNUmber;
    }

    static double findTheArithmeticMean(double numbers[]) {

        double theArithmeticMean = sumNumberArr(numbers) / numbers.length;

        return theArithmeticMean;
    }

    static void findElementsGreaterThanTheArithmeticMean(double numbers[]) {

        double theArithmeticMean = findTheArithmeticMean(numbers);
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > theArithmeticMean) {
                System.out.println("Элемент массива, который больше среднего арифметического " + numbers[i]);
            }
        }
    }
}
