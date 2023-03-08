package homeWork221107String;


/**
 * Реализовать метод, который вставляет точку в конце предложения,
 * если она не была записана
 */

public class Task7 {
    public static void main(String[] args) {
        String text = "Реализую метод";

        char point = ('.');
        if (text.indexOf(point) == -1) {
            System.out.println(text + point + " " + "Точка требуется");
        }
        else {
            System.out.println("Точка не требуется");
        }
    }
}
