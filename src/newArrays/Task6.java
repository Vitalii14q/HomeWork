package newArrays;

public class Task6 {
    /**
     * Максимальный по модулю элемент массива
     */
    public static void main(String[] args) {
        int[] numbers = {-1, 2, 3,-7,6};

        int maxPositive = numbers[0];
        int maxNegative = numbers[0];


        for (int i = 0; i < numbers.length; i++) {    // находим максимальный элемент массива
            if (maxPositive < numbers[i]) {
                maxPositive = numbers[i];
            }
            if (maxNegative > numbers[i]) {    // находим максимальный элемент массива с отрицательным знаком
                maxNegative = numbers[i];
            }
        }
        int maxNegativeElement = -maxNegative;    //создаем переменную , что бы убрать отрицательный знак с максимального негативного элемента
        if (maxPositive >= maxNegativeElement){    // запускаем проверку какой элемент больше максимальный или максимальный отрицательный
            System.out.println(maxPositive);
        } else {
            System.out.println(maxNegative);
        }

    }
}
