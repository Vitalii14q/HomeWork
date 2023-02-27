package Worker;

public abstract class Worker extends Human {
    private long id;
    private double salary;
    public String department;

    public Worker (int age, String name, long id, double salary, String department) {
        super();
        this.id = id;
        this.salary = salary;
        this.department = department;
    }

    public long getId () {
        return id;
    }

    public void setSalary (double salary) {
        this.salary = salary;
    }

    public double getSalary () {
        return salary;
    }

    public String getDepartment() {
        return department;
    }

    public abstract double calculatePay();
}
