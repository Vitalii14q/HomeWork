package HomeWork220924Cycles;

public class Task2 {
    /**Пользователь вводит свое имя и возраст.
     * Если возраст пользователя больше 18, то вывести строку
     * "Добрый вечер, name! Вы совершеннолетний, поздравляем!",
     * иначе вывести строку "Привет, name! Приносим извинения, но вы не можете гулять после 22:00"
     */
    public static void main(String[] args) {
        char name = 'v';
        int age = 19;
        if (age > 18) {
            System.out.println("Добрый вечер," + name + "! Вы совершеннолетний, поздравляем!");
        } else {
            System.out.println("Привет," + name + "! Приносим извинения, но вы не можете гулять после 22:00");
        }

    }
}