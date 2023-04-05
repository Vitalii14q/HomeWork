package problemSecond.inheritance;

public class Person {

    private String name;
    private int age;

    public Person (String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void eat () {
        System.out.println("Person is eating");
    }

    public void sleep () {
        System.out.println("Person is sleeping");
    }

    public void work () {
        System.out.println("Person is working");
    }
}


