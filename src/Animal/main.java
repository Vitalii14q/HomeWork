package Animal;

public class main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Animal animal = dog;
        animal.doVoice();
        dog.doVoice();
        Shepherd shepherd = new Shepherd();
        Dog dog1 = shepherd;
        shepherd.getGun();
        Animal anim = shepherd;
        Object ob = shepherd;

    }
}
