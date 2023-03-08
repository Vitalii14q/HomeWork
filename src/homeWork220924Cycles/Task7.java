package homeWork220924Cycles;

public class Task7 {
    /**
     * Пользователь вводит целое число. Выведите его строку-описание вида
     * "отрицательное четное число", "нулевое число", "положительное нечетное
     * число", например, численным описанием числа 190 является строка
     * "положительное четное число".
     */
    public static void main(String[] args) {
        int userNumber = 0;
        if (userNumber % 2 == 0) {
            if  (userNumber < 0) {
                System.out.println("отрицательное четное число");
            } else if (userNumber > 0) {
                System.out.println("положительное четное число");
            } else {
                System.out.println("zero");
            }
        } else {
            if (userNumber < 0) {
                System.out.println("отрицательное не четное число");
            } else {
                System.out.println("отрицательное четное число");
            }
        }
    }
}
