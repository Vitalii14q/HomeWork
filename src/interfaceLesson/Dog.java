package interfaceLesson;

public class Dog implements Jumper {
    @Override
    public int jump(int steps) {
        System.out.println("Я собака, я прыгаю на " + steps + " м ");
        return 0;
    }

    public int getAge(int age) {
        return age;
    }
}
