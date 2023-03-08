package homeWork221023Arrays;

public class Task3 {
    /**
     * Сумма элементов частей массива
     */
    public static void main(String[] args) {

        int []numbers = {1, 2, 3, 4, 5, 6};

        int firstIndex = 2;
        int lastIndex = 4;

        System.out.println(getSumElements(numbers, firstIndex, lastIndex));

    }

    static int getSumElements(int []numbers, int firstIndex, int lastIndex) {

        int sum = 0;
        for (int i = firstIndex; i <= lastIndex; i++) {
            sum += numbers[i];

        }
        return sum;
    }

}

