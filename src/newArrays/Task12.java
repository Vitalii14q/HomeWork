package newArrays;

public class Task12 {
    /**
     * Найти количество положительных элементов массива
     */
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, -2};

        int countPositiveElement = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > 0) {    //пока элемент массива больше ноля
                countPositiveElement++;    // мы записываем его в счетчик который и будем выводить в консоль ниже
            }
        }
        System.out.println("Количество положительных элементов в массиве " + countPositiveElement);
    }
}

