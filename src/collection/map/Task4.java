package collection.map;

import java.util.HashMap;

/**
 * В настольной игре Скрабл (Scrabble) каждая буква имеет определенную ценность. В случае с английским алфавитом очки распределяются так:
 * A, E, I, O, U, L, N, S, T, R – 1 очко;
 * D, G – 2 очка;
 * B, C, M, P – 3 очка;
 * F, H, V, W, Y – 4 очка;
 * K – 5 очков;
 * J, X – 8 очков;
 * Q, Z – 10 очков.
 * Напишите программу, которая вычисляет стоимость введенного пользователем слова. Будем считать, что на вход подается только одно слово,
 * которое содержит либо только английские, либо только русские буквы.
 */

public class Task4 {
    public static void main(String[] args) {
        HashMap<Character, Integer> hashMap = new HashMap<>();
        hashMap.put('A', 1);
        hashMap.put('E', 1);
        hashMap.put('I', 1);
        hashMap.put('O', 1);
        hashMap.put('U', 1);
        hashMap.put('L', 1);
        hashMap.put('N', 1);
        hashMap.put('S', 1);
        hashMap.put('T', 1);
        hashMap.put('D', 1);
        hashMap.put('G', 2);
        hashMap.put('B', 2);
        hashMap.put('C', 3);
        hashMap.put('M', 3);
        hashMap.put('P', 3);
        hashMap.put('F', 3);
        hashMap.put('H', 4);
        hashMap.put('V', 4);
        hashMap.put('W', 4);
        hashMap.put('Y', 4);
        hashMap.put('K', 5);
        hashMap.put('J', 8);
        hashMap.put('X', 8);
        hashMap.put('Q', 10);
        hashMap.put('Z', 10);

        String word = "WERWEFPXZ";
        int totalScore = 0;
        for (int i = 0; i < word.length(); i++) {
            char letter = word.charAt(i); // берем текущий символ из строки word по индексу i и сохраняем его в переменную letter.
            Integer score = hashMap.get(letter); //Здесь мы пытаемся получить из HashMap соответствующее значение для символа letter. Если такое значение есть в HashMap, то мы получим его, если нет, то score будет равен null. Мы используем класс-обертку Integer вместо примитивного типа int, чтобы можно было проверить на равенство null.
            if (score != null) { // Здесь мы проверяем, что значение score не равно null. Если это так, то символ letter присутствует в HashMap, и мы можем добавить очки за него в общую сумму.
                totalScore += score; //Здесь мы добавляем очки за символ letter к общей сумме очков totalScore. Если символа нет в HashMap, то он будет проигнорирован
            }
        }
        System.out.println("Стоимость слова " + word + " равна " + totalScore + " очкам.");
    }
}
