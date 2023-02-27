package Worker;

public class PostMan  extends Worker{
    private int volumeOfDeliveredParcels;

    public PostMan (int age, String name, long id, double salary, String department, int volumeOfDeliveredParcels) {
        super(age, name, id, salary, department);
        this.volumeOfDeliveredParcels = volumeOfDeliveredParcels;
    }

    public void setVolumeOfDeliveredParcels(int volumeOfDeliveredParcels) {
        this.volumeOfDeliveredParcels = volumeOfDeliveredParcels;
    }

    public int getVolumeOfDeliveredParcels () {
        return volumeOfDeliveredParcels;
    }

    @Override
    public double calculatePay() {
        return getVolumeOfDeliveredParcels() + getSalary(); // нужен расчет посылка = деньги
    }
}
