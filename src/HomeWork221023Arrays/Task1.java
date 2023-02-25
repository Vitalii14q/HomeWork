package HomeWork221023Arrays;

public class Task1 {
    /**
     * Сумма и произведение элементов одномерного массива
     */

    public static void main(String[] args) {
        int[] numbers = {1,11,1};

        int sum = 0;
        int multiplication = 1;
        for (int value : numbers) {
            sum += value;
            multiplication *= value;
        }
            System.out.println("Сумма = " + sum);
            System.out.println("Произведение = " + multiplication);
            System.out.println(numbers.length);
    }
}
