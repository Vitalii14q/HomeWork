package newArrays;

public class Task9 {
    /**
     * Разделить элементы массива на максимальный
     */
    public static void main(String[] args) {
        int[] numbers = {14, 21, 333, 43, 53, 63, 7};
        double maxElement = numbers[0];    //переменная для записи в нее максимального числа
        double result = 0;    //переменная для записи в нее результата деления

        for (int i = 0; i < numbers.length; i++) {    //находим максимальное число
            if (maxElement < numbers[i]){
                maxElement = numbers[i];
            }
        }
        for (int i = 0; i < numbers.length; i++) {
            result = numbers[i] / maxElement;    //делим все элементы массива на максимальный элемент массива
            System.out.println(result);
        }
    }
}
