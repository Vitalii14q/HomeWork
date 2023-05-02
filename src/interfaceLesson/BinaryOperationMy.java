package interfaceLesson;

import java.util.function.BinaryOperator;

public class BinaryOperationMy {

    public int binaryOperation (int a, int b, BinaryOperator<Integer> binaryOperator) {
        int result = binaryOperator.apply(a, b);
        System.out.println(result);
        return result;
    }
}
