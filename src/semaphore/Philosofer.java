package semaphore;

public class Philosofer extends Thread{
    private String name;
    private Table table;

    public Philosofer (String name, Table table) {
        this.name = name;
        this.table = table;
    }

    @Override
    public void run() {
        table.seatOnTheTAble(name);

    }
}
