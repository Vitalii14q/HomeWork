package Worker;

public class SalesMan extends Worker {
    private int sales;

    public SalesMan (int age, String name,  long id, double salary, String department, int sales) {
        super(age, name, id, salary, department);
        this.sales = sales;
    }

    @Override
    public String getDepartment() {
        return super.getDepartment();
    }

    public int getSales () {
        return sales;
    }

    @Override
    public double calculatePay() {
        return getSales() + getSalary(); // нужен расчет, продажа = бонус
    }
}
