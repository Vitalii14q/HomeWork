package homeWork221023Arrays;


public class Task9 {
    /**
     * Разделить элементы массива на максимальный
     */
    public static void main(String[] args) {
        double []numbers = {1, 2, 3, 4, 5};

        arrayDivision(numbers);
    }

    static double isMaxElement(double []numbers) {

        double maxNumber = numbers[0];
        for (double value : numbers) {
            if (maxNumber < value) {
                maxNumber = value;
            }
        }
        return maxNumber;
    }

    static void arrayDivision(double []numbers) {

        double number = isMaxElement(numbers);
        for (double value : numbers) {
            System.out.println(value / number);
        }
    }
}
