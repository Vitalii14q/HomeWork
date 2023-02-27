package Worker;

public class main {
    public static void main(String[] args) {
        GenerateId generateId = new GenerateId();
        PostMan postMan = new PostMan(32, "John",0, 350.000, "Почтальон" , 60);
        System.out.println("Id сотрудника: " + generateId.generateId());
        System.out.println("Зарплата + премия: " + postMan.calculatePay());
        SalesMan salesMan = new SalesMan(19, "Raymond", 0, 120.000, "Продавец",35);
        System.out.println("Id сотрудника: " + generateId.generateId());
        System.out.println("Зарплата + премия: " + salesMan.calculatePay());
    }
}
