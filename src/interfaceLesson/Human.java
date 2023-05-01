package interfaceLesson;

public class Human implements Jumper{
    @Override
    public int jump(int steps) {
        System.out.println("Я человек, я прыгаю на " + steps + " м ");
        return steps;
    }

    public String getColor(String color) {
        return color;
    }
}
