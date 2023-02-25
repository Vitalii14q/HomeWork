package NewArrays;

public class Task8 {
    /**
     * Заменить элементы массива на противоположные
     */
    public static void main(String[] args) {
        int[] numbers = {1, 2, -3, -4, -7};
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = -numbers[i];    //присваиваем минус положительным элементам и убираем минус от отрицательных элементов массива
            System.out.println(numbers[i]);
        }
    }
}
