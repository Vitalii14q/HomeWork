package NewArrays;

public class Task1 {
    /**
     * Сумма и произведение элементов одномерного массива
     */
    public static void main(String[] args) {
        int[] numbers = {1, 3, 4, 5};    //создаем массив

        int sum = 0;    //переменная куда будем записывать сумму
        int multiplication = 1;   //переменная куда будем записывать произведение
        for (int i = 0; i < numbers.length; i++) {    //двигаемся по массиву пока i меньше длинны массива
            sum += numbers[i];    //извлекаем элемент массива по индеку и скаладываем его
            multiplication *= numbers[i];    //извлекам элемент массива по индеку и умножаем его

        }
        System.out.println(sum + " " + "Сумма элементов массива");
        System.out.println(multiplication + " " + "Произведение элементов массива");
    }
}
