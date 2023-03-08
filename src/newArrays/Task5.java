package newArrays;

public class Task5 {
    /**
     * Поиск максимального и минимального элемента в массиве
     */
    public static void main(String[] args) {
        int[] numbers = {-1, 0, 5, -7};

        int maxElement = numbers[0];    //создаем переменную где будем хранить максимальный элемент массива
        int minElement = numbers[0];    //создаем переменную где будем хранить минимальный элемент массива

        for (int i = 0; i < numbers.length; i++) {
            if (maxElement < numbers[i]){    //если текущий элемент массива больше maxElement
                maxElement = numbers[i];    // то мы записываем его в нашу переменную
            }
            if (minElement > numbers[i]){    //если текущий элемент массива меньше minElement
                minElement = numbers[i];    // то мы записываем его в нашу переменную
            }
        }
        System.out.println(maxElement + " " + minElement );

    }
}
