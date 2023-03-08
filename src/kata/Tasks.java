package kata;

/**
 * Даны два массива, в которых значения представляют собой силу каждого солдата, верните true, если вы выжили после атаки, или false, если погибнете.
 *
 * УСЛОВИЯ
 *
 * Каждый солдат атакует солдата противника с тем же индексом массива. Выживший - это число с наибольшим значением.
 * Если значение одинаковое, они оба погибают
 * Если одно из значений пусто (различная длина массива), солдат с непустым значением выживает.
 * Чтобы выжить, обороняющаяся сторона должна иметь больше выживших, чем атакующая сторона.
 * В случае, если с обеих сторон одинаковое количество выживших , побеждает команда с наибольшей начальной силой атаки . Если общая сила атаки обеих сторон одинакова, верните true .
 * Начальная сила атаки представляет собой сумму всех значений в каждом массиве.
 *
 * attackers=[ 1, 3, 5, 7 ]   defenders=[ 2, 4, 6, 8 ]
 * 0 survivors                4 survivors
 * return true
 *
 *
 * attackers=[ 1, 3, 5, 7 ]   defenders=[ 2, 4 ]
 * 2 survivors  (16 damage)   2 survivors (6 damage)
 * return false
 *
 * attackers=[ 1, 3, 5, 7 ]   defenders=[ 2, 4, 0, 8 ]
 * 1 survivors                3 survivors
 * return true
 */

public class Tasks {
    public static void main(String[] args) {

        int[] attackers1 = {1, 3, 5, 7};
        int[] defenders1 = {2, 4, 6, 8};
        System.out.println(survives(attackers1, defenders1));

        int[] attackers2 = {1, 3, 5, 7};
        int[] defenders2 = {2, 4};
        System.out.println(survives(attackers2, defenders2));

        int[] attackers3 = {1, 3, 5, 7};
        int[] defenders3 = {2, 4, 0, 8};
        System.out.println(survives(attackers3, defenders3));
    }

    public static boolean survives(int[] attackers, int[] defenders) {
        int survivorsCountA = 0;
        int survivorsCountD = 0;
        int damageA = 0;
        int damageD = 0;

        int length = Math.min(attackers.length, defenders.length);
        for (int i = 0; i < length; i++) {
            if (attackers[i] > defenders[i]) {
                survivorsCountA++;
                damageA += attackers[i];
            } else if (attackers[i] < defenders[i]) {
                survivorsCountD++;
                damageD += defenders[i];
            }
        }

        if (attackers.length > length) {
            for (int i = length; i < attackers.length; i++) {
                survivorsCountA++;
                damageA += attackers[i];
            }
        } else if (defenders.length > length) {
            for (int i = length; i < defenders.length; i++) {
                survivorsCountD++;
                damageD += defenders[i];
            }
        }

        return (survivorsCountD > survivorsCountA || (survivorsCountA == survivorsCountD && damageD > damageA) || (survivorsCountA == 0 && survivorsCountD == 0 && damageA == damageD));
    }
}
