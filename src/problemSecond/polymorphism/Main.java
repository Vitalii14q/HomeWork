package problemSecond.polymorphism;

public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        Student student = new Student();
        Worker worker = new Worker();

        // восходящие преобразование. Eго Java делает сама потому что Student это точно Person и мы можем рассматривать Student как Person.
        Student student1 = new Student();
        Person person1 = student1; // объект уходит вверх по иерархии наследования

        // нисходящее преобразование.
        Student student2 = (Student) person1; // (Student) оператор приведения типа. Преобразования не меняют объект, а меняют ссылку на него.
        // при нисходящее преобразование может быть ошибка о невозможности преобразования.


        getSleep(person); // благодаря полиморфизму мы можем использовать один метод для всех объектов родительского класса
        getSleep(student); // в классе student метод sleep переопределен.
        getSleep(worker); // если в классе нет переопределенного метода, то он наследует родительский.


    }
    public static void getSleep (Person person) { //метод имеет на вход какого то человека.
        person.sleep(); // обращаемся к методу родительского класса.
    }
}
/**
 * Полиморфизм параметров - это способность использовать объекты разных классов как параметры методов,
 * имеющих общий интерфейс (т.е. методы с одинаковым названием и набором параметров).
 * Это означает, что метод может принимать объекты разных классов,
 * но с одинаковым интерфейсом, и выполнять одинаковые операции с ними.
 */