package kata;

/**
 * вывести на экран квадрат , со стороной а
 *   ***
 *   * *
 *   ***
 */

public class TaskSquare {
    public static void main(String[] args) {
        int a = 10;
        char symbol = '*';

        for (int i = 0; i < a; i++) {
            System.out.print(symbol);
        }
        System.out.println();
        for (int i = 0; i < a - 2; i++) {
            System.out.print(symbol);
            for (int j = 0; j < a - 2; j++) {
                System.out.print(" ");
            }
            System.out.println(symbol);
        }
        for (int i = 0; i < a; i++) {
            System.out.print(symbol);
        }
    }
}
