package homeWork220924Cycles;

public class Task4 {
    /**Пользователь вводит целое число. Проверьте являться ли это число
     * четырехзначным, если является, то выведите строку "Успешно", иначе
     * "Неудача".
     */
    public static void main(String[] args) {
        int a = 32320;
        if (1000 <= a && a <= 9999) {
            int b =3;
            System.out.println("Успешно");
        } else {
            System.out.println("Неудача");
        }
    }
}
