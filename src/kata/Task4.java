package kata;

/**
 * Электронные часы показывают время в формате от 00:00 до 23:59.
 * Подсчитать сколько раз за сутки случается так,
 * что слева от двоеточия показывается симметричная комбинация для той,
 * что справа от двоеточия (например, 02:20, 11:11 или 15:51).
 */
public class Task4 {
    public static void main(String[] args) {
        considersCombinationsSymmetrical(23,59);

    }

    static void considersCombinationsSymmetrical (int numberOfHours, int numberOfMinutes) {
        int count = 0;

        for (int hours = 0; hours <= numberOfHours; hours++) {
            for (int minutes = 0; minutes <= numberOfMinutes; minutes++){
                if (hours / 10 == minutes % 10 && hours % 10 == minutes / 10) { // проверяем в нутри циклов, является ли час или минута семетричной коминацией, если это так, увеличиваем счетчик.
                    count++;
                    System.out.println(hours + " " +minutes);
                }
            }
        }
        System.out.println("симметричных комбинаций: " + count);
    }
}

