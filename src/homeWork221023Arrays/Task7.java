package homeWork221023Arrays;

public class Task7 {
    /**
     * Найти два максимальных элемента массива
     */
    public static void main(String[] args) {
        int []numbers = {5, 7 ,3 ,-1 ,4 ,8};

        twoMaximumElements(numbers);

    }
    static void twoMaximumElements(int []numbers) {

        int maxFirst = 0;
        int maxSecond = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (maxFirst < numbers[i]) {
                maxSecond = maxFirst;
                maxFirst = numbers[i];
            } else if (numbers[i] > maxSecond && maxFirst != numbers[i]) {
                maxSecond = numbers[i];
            }
        }
        System.out.println("Первый максимальный элемент " + maxFirst);
        System.out.println("Второй максимальный элемент " + maxSecond);
    }
}

