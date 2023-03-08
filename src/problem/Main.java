package problem;

public class Main {
    public static void main(String[] args) {

        Person person = new Person("John", 30);  //ИмяКласса названиеОбъекта = new(ключевое слово) конструктор
        // конструктор помогает инициализировать объект при его создании
        person.printDetails(); // выводит информацию о нашем Person
        Person person1 = person;  // person и person1 ссылаются на один объект
        person1.printDetails(); // тут мы видим что person1 такой же, как и person.
        System.out.println(person1.setName("Jane")); //тут мы меняем значения переменной.
        System.out.println("Age: " + person1.setAge(31));  //тут мы меняем значения person1 с помощью метода setAge.
        person.getHello();
        person1.introduceYourself();
        person1.tellUsTheAge();
    }
}
