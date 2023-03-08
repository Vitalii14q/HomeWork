package homeWork220924Cycles;

public class Task3 {
    /**Пользователь вводит три целых числа. Два из них равны друг другу. Выведите
     * третье число, не равное остальным. Если среди введенных чисел не оказалось
     * двух равных друг другу, выведите строку "Ошибка".
     */
    public static void main(String[] args) {
        int a = 15;
        int b = 17;
        int c = 16;
        if (a != b && b == c) {
            System.out.println("b = c");
        } else if (b == a && b != c) {
            System.out.println("a = b");
        } else if (c == a && c != b) {
            System.out.println("a = c");
        } else {
            System.out.println("Ошибка");
        }
    }
}
