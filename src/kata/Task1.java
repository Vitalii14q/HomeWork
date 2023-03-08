package kata;

/**
 * Теорема Пифагора: вывести все прямоугольные треугольники, стороны
 * которых – натуральные числа меньше 1000, посчитать их количество(по
 * теореме Пифагора у прямоугольного треугольника сумма квадратов катетов
 * равна квадрату гипотенузы). Подсказка: использовать полный перебор с
 * трижды вложенными циклами.
 */

public class Task1 {
    public static void main(String[] args) {
        printAllRightTriangles(1000);
    }

    static void printAllRightTriangles(int naturalNumber) {
        int count = 0;

        for (int a = 1; a <= naturalNumber; a++) {
            for (int b = a; b <= naturalNumber; b++) {
                for (int c = b; c <= naturalNumber; c++) {
                    if (a * a + b * b == c * c) {
                        //System.out.println(a + " " + b + " " + c);
                        count++;
                    }
                }
            }
        }
        System.out.println("Количество прямоугольных треугольников: " + count);
    }
}
