package newArrays;

public class Task10 {
    /**
     * Найти разность между максимальным и минимальным элементами
     * массива
     */
    public static void main(String[] args) {
        int[] numbers = {1, 3, 5, 6, -7};

        int maxElement = numbers[0];    //переменная которая будет хранить максимальный элемент массива
        int minElement = numbers[0];    //переменная которая будет хранить минимальный элемент массива
        int result;    //переменная в которой будет лежать разница между максимальным и минимальным элементом массива

        for (int i = 0; i < numbers.length; i++) {    //поиск максимальнго элемента массива
            if (maxElement < numbers[i]) {
                maxElement = numbers[i];
            }
            if (minElement > numbers[i]) {    //поиск минимального элемента
                minElement = numbers[i];
            }
        }
        result = maxElement - minElement;    //считаем разницу между максимальным и минимальным элементам массива
        System.out.println("Разница между максимальным и минимальным элементами массива " + result);
    }
}
