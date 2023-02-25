package HomeWork221023Arrays;

public class Task6 {
    /**
     * Максимальный по модулю элемент массива
     */
    public static void main(String[] args) {
        int []numbers = {-1, -400, 1, 2, 3, 4, 255};

        findMaxElementModulo(numbers);

    }
    static int findMaxPositiveElement(int []numbers) {

        int  maxElement = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (maxElement < numbers[i]) {
                maxElement = numbers[i];
            }
        }
        return maxElement;
    }

    static int findMaxNegativeElement(int []numbers) {

        int maxElement = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (maxElement > numbers[i]) {
                maxElement = numbers[i];
            }
        }
        return maxElement;
    }

    static void findMaxElementModulo(int []numbers) {

        int maxNegativeElement = -findMaxNegativeElement(numbers);
        if (findMaxPositiveElement(numbers) >= maxNegativeElement) {
            System.out.println(findMaxPositiveElement(numbers));
        } else {
            System.out.println(findMaxNegativeElement(numbers));
        }
    }
}
