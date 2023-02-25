package Kata;

public class Car {
    private String color;


    private Car (String color){
        this.color = color;
    }

    public Car (String color, int age) {
        this(color);
    }
}
