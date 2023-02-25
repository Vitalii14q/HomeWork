package NewArrays;

public class Task2 {
    /**
     * Сумма положительных элементов массива
     */
    public static void main(String[] args) {
        int[] numbers = {-1, 3, -4, 5};

        int sum = 0;    //переменная где будем хранить результат
        for (int i = 0; i < numbers.length; i++) {    //идем по длинне массива
            if (numbers[i] > 0){    // делаем проверку по нашему условию , что бы элемент массива был больше ноля
                sum += numbers[i];    // складываем элементы массива которые больше ноля
            }
        }
        System.out.println(sum);
    }
}
