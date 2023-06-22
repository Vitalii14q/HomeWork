package Semaphore;

import java.util.concurrent.Semaphore;

public class Table {
    private Semaphore semaphore;

    public Table (Semaphore semaphore) {
        this.semaphore = semaphore;
    }

    public void seatOnTheTAble (String name) {
        try {
            semaphore.acquire();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(name + "Сел за стол");
        try {
            Thread.sleep(2000);
        } catch (Exception e) {

        }
        semaphore.release();
        System.out.println(name + "Вышел из за стола");

    }
}
