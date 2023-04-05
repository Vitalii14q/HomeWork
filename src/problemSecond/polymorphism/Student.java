package problemSecond.polymorphism;

public class Student extends Person{

    @Override
    public void sleep() {
        System.out.println("Student is sleeping");
    }

    public void walk () {
        System.out.println("Student is walking");
    }
}
