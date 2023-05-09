package interfaceLesson.MyInterface;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.makeSound();

        // MakeSound такой тип данный мы используем потому что наш bird реализует интерфейс make-sound
        MakeSound bird = () -> System.out.println("Птица поёт"); //  () -> System.out.println("Птица поёт") этим выражением создали класс и заполнили его метод. Создаем реализацию, не создавая класс.
        bird.makeSound();
    }
}
