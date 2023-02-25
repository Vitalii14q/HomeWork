package HomeWork221023Arrays;

public class Task16 {
    /**
     * Определить индексы элементов массива, значение которых лежит
     * в указанном пределе
     */
    public static void main(String[] args) {

        int []numbers = {50, -60, 56, 77, 109, 98};

        int min = 55;
        int max = 101;

        for (int i = 0; i < numbers.length; i++) {
            if (min <= numbers[i] && numbers[i] <= max) {

                System.out.println(numbers[i] + " " + i);
            }
        }
    }
}
