package HomeWork220927Cycles;

public class Task6 {
    /**
     * Вывести Числа Фибоначчи
     */
    public static void main(String[] args) {
        int userNumber = 3;
        long a = 0;
        long b = 1;

        int i = 2;
        while (i <= userNumber){
            long next = a + b;
            a = b;
            b = next;
            i++;
        }
//        for (int i = 2; i <= userNumber; i++) {
//            long next = a + b;
//            a = b;
//            b = next;
//        }
        System.out.println(b);
    }
}