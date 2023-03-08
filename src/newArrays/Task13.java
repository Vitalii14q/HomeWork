package newArrays;

public class Task13 {
    /**
     * Количества отрицательных и положительных элементов в массиве
     */
    public static void main(String[] args) {
        int[] numbers = {1, -2, 3, -4, 5};

        int countPositiveElements = 0;
        int countNegativeElements = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > 0) {    //пока элемент массива больше ноля
                countPositiveElements++;    // мы записываем его в счетчик который и будем выводить в консоль ниже
            }
            if (numbers[i] < 0) {    //пока элемент массива меньше ноля
                countNegativeElements++;    // мы записываем его в счетчик который и будем выводить в консоль ниже
            }
        }
        System.out.print("Количество положительных элементов массива " + countPositiveElements + " " + "Количество отрицательных элементов массива " + countNegativeElements);
    }
}
