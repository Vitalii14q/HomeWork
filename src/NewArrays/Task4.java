package NewArrays;

public class Task4 {
    /**
     * Первый положительный элемент массива
     */
    public static void main(String[] args) {
        int[] numbers = {-1, 2, -3, 4};

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > 0){    //ищем положительные элементы массива
                System.out.println(numbers[i]);    //выводим в консоль положительные элементы массива
                break;    //остонавливаем цикл после того как мы нашли первый положительный элемент массива
            }
        }
    }
}
