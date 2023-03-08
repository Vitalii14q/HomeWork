package homeWork221023Arrays;

public class Task15 {
    /**
     * Элементы массива, которые больше предыдущего
     */
    public static void main(String[] args) {

        int []numbers = {5, 2, 4, 4, 5,};


        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i - 1] < numbers[i]) {
                System.out.println(numbers[i]);
            }
        }
    }
}
