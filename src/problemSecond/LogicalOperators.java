package problemSecond;

public class LogicalOperators {
    private int a;
    private int b;
    private int c;

    public LogicalOperators (int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public void usingLogicalOperators () {
        boolean result1;
        boolean result2;
        boolean result3;

        // Использование логических операторов
        result1 = (a > b) && (b > c); // и
        result2 = (a < b) || (b < c); // или
        result3 = !(a == b); // не равен/отрицание.

        System.out.println("Первый результат: " + result1 + "\n" + "Второй результат: " + result2 + "\n" + "Третий результат: " + result3);
    }
}
