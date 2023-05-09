package interfaceLesson.MyInterface;

public class Cat implements MakeSound{

    @Override
    public void makeSound() {
        System.out.println("Кошка мяукает");
    }
}
