package homeWork221023Arrays;

public class Task18 {
    /**
     * Есть ли в массиве одинаковые элементы
     */
    public static void main(String[] args) {

        int []numbers = {1, 2, 4, 3};

        boolean flag = false;
        loop: for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] == numbers[j]) {
                    flag = true;
                    break loop;
                }
            }
        }
        System.out.println(flag);
    }
}
