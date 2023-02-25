package Problem;

public class Person {
    public String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(){

    }

    public void printDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public String setName(String name) {
        return "Name: " + name;
    }

    public int setAge(int age) {
        return age;
    }

    public void getHello () {
        System.out.println("Hello");
    }

    public void introduceYourself() {
        System.out.println("May name is: " + name);
    }

    public void tellUsTheAge() {
        System.out.println("I`m " + age + " years old.");
    }
}
