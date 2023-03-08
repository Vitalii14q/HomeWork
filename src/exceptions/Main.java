package exceptions;

public class Main {

    public static void main(String[] args) {

        try {
            System.out.println(countTheSumOfTwoNumbers(4,4));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static int countTheSumOfTwoNumbers (int firstNumber, int secondNumber) throws Exception {
        if (firstNumber == 0) {
            throw new Exception();
        }
        int sum = 0;
        sum = firstNumber + secondNumber;
        return sum;
    }
}
