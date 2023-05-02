package interfaceLesson;

import java.util.ArrayList;
import java.util.function.BinaryOperator;

public class Main {
    public static void main(String[] args) {
        Human human = new Human();
        Dog dog = new Dog();
        Jumper jumper = new Human();
        Jumper jumper1 = new Dog();
        human.jump(30);
        dog.jump(150);
        ArrayList<Jumper> allJumpers = new ArrayList<>();
        allJumpers.add(dog);
        allJumpers.add(human);
        BinaryOperationMy binaryOperationMy = new BinaryOperationMy();
        binaryOperationMy.binaryOperation(5, 6, (a, b) -> a + b);

    }
}
