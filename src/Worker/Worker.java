package Worker;

public abstract class Worker extends Human {
    private int id;
    private double salary;
    private String department;

    public Worker (int age, String name, int id, double salary, String department) {
        super();
        this.id = id;
        this.salary = salary;
        this.department = department;
    }

    public int getId () {
        return id;
    }

    public double getSalary () {
        return salary;
    }

    public String getDepartment() {
        return department;
    }

    public abstract double calculatePay ();
}
