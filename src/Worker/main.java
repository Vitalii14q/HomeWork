package Worker;

public class main {
    public static void main(String[] args) {
        PostMan postMan = new PostMan(32, "John",0, 350.000, "Почтальон" , 60);
        System.out.println(postMan.generateId());
        System.out.println(postMan.calculatePay());
    }
}
