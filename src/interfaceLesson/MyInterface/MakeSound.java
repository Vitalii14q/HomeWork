package interfaceLesson.MyInterface;

@FunctionalInterface
public interface MakeSound { // функциональным интерфейсом может только тот интерфейс, который имеет только один абстрактный метод
    void makeSound(); // абстрактный метод, метод у которого нет реализации
}
