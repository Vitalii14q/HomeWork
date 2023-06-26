package semaphore;

import java.util.concurrent.Semaphore;

public class Main {
    public static void main(String[] args) {
        Semaphore semaphore = new Semaphore(2);
        Table table = new Table(semaphore);
        Philosofer philosofer1 = new Philosofer("Гриша", table);
        Philosofer philosofer2 = new Philosofer("Витя", table);
        Philosofer philosofer3 = new Philosofer("Петя", table);
        Philosofer philosofer4 = new Philosofer("Антон", table);
        Philosofer philosofer5 = new Philosofer("Вася", table);
        philosofer1.start();
        philosofer2.start();
        philosofer3.start();
        philosofer4.start();
        philosofer5.start();
    }
}
