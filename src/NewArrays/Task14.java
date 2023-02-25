package NewArrays;

public class Task14 {
    /**
     * Вывести элементы массива, которые больше среднего
     * арифметического
     */
    public static void main(String[] args) {
        int[] numbers = {1, 2, -3, 4, 5, 6};
        double sumElementArray = 0;    // переменная для хранения в ней суммы всех элементов массива
        double findArithmeticMean;    // переменная для хранения в ней среднего арифметического массива

        for (int i = 0; i < numbers.length; i++) {
            sumElementArray += numbers[i];    //получаем сумму всех элементов массива
        }

        findArithmeticMean = sumElementArray / numbers.length;    //получаем среднее арифметическое массива
        for (int i = 0; i < numbers.length; i++) {
            if (findArithmeticMean < numbers[i]) {    //поиск элементов массива которые больше среднего арифметического
                System.out.println(numbers[i]);
            }
        }
    }
}
