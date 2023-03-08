package homeWork220924Cycles;

public class Task6 {
    /**
     * Пользователь вводит целое число - номер месяца своего рождения. Выведите
     * строку "Вы родились летом", если номер месяц совпадает с номером одного из
     * летних месяцев. Если номер месяца совпал с номером одного из зимних
     * месяцев, то нужно вывести "К холодам вам не привыкать". Для людей, которые
     * празднуют свой день рождения осенью выведите "Я тоже люблю осенний
     * листопад". Если весна ваше время года выведите строку "Подснежник". В
     * случае, если введенное число меньше единицы или больше 12, выведите строку "Ошибка".
     */
    public static void main(String[] args) {
        int monthOfBirth = 1;
        if (1 <= monthOfBirth && monthOfBirth <= 2 || monthOfBirth == 12) {
            System.out.println("К холодам вам не привыкать");
        } else if (3 <= monthOfBirth && monthOfBirth <= 5) {
            System.out.println("Подснежник");
        } else if (6 <= monthOfBirth && monthOfBirth <= 8) {
            System.out.println("Вы родились летом");
        } else if (9 <= monthOfBirth && monthOfBirth <= 11) {
            System.out.println("Я тоже люблю осенний листопад");
        } else {
            System.out.println("Ошибка");
        }
    }
}
