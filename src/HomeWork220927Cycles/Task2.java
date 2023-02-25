package HomeWork220927Cycles;

public class Task2 {
    /**
     * Вывести Кубы чисел от A до B
     */
    public static void main(String[] args) {
        int a = 5;
        int b = 55;

        int i = a;
        while (i <= b) {
            System.out.println(i * i * i);
            i++;
        }
    }
}
