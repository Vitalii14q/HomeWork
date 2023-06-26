package objectOop;

public class Ostrich {

    private String name;
    private int age;
    private String color;
    private int weight;
    private int longLeg;
    private final String breed;

    public Ostrich (String name, int weight, int longLeg, String breed, String color) {
        this.name = name;
        this.weight = weight;
        this.longLeg = longLeg;
        this.breed = breed;
        this.color = color;

    }

    public String toString() {
        return name + " " + age + " " + color + " " + weight + " " + longLeg + " " + breed;}

    public void spekName() {
        System.out.println(name);
    }

    public String getBreed() {
        return breed;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public void setLongLeg(int longLeg) {
        this.longLeg = longLeg;
    }

    public int getLongLeg() {
        return longLeg;
    }
}

