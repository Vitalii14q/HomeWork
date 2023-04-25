package collection.map;

import java.util.HashMap;

/**
 * Дан текст. Необходимо определить частоту вхождения каждого слова и вывести эту информацию
 * в порядке убывания по количеству вхождений
 */

public class Task5 {

    private static final HashMap<String, Integer> wordCount = new HashMap<>(); // создаем объект HashMap для хранения количества вхождений каждого слова

    public static void main(String[] args) {
        System.out.println(findTheMostCommonWord("Привет привет привет идти идти как быть куда и почему привет привет"));

    }

    public static int findTheMostCommonWord (String text) {
        String words[] = text.replaceAll("\\p{Punct}", "").toLowerCase().split("\\s+"); // создаем массив строк words, который получается путем замены всех знаков препинания и приведения текста к нижнему регистру, а затем разбиения строки на отдельные слова с помощью метода split()

        int CountRepeatWord = 0;
        //String mostCommonWord = " ";

        for (String word : words) { // создаем цикл for each, который перебирает все слова массива words
            Integer count = wordCount.get(word);
            if (count != null) { // если слово уже есть в HashMap, то увеличиваем его значение на 1
                wordCount.put(word, count + 1);
            } else {
                wordCount.put(word, 1); // иначе добавляем его в HashMap с начальным значением 1
            }
            // а тут мы будем возвращать результат второго метода, где
        }

        for (String word : wordCount.keySet()) { // Перебирает все элементы wordCount.keySet(). Ключи в wordCount являются строками, поэтому в данном случае мы перебираем все слова в wordCount.
            int count = wordCount.get(word); // Количество вхождений текущего слова, используя метод get на wordCount. Значение сохраняется в переменной count.
            if (count > CountRepeatWord) { // является ли количество вхождений текущего слова больше, чем CountRepeatWord, который является переменной, содержащей текущее максимальное количество вхождений слова.
                CountRepeatWord = count; // Если количество вхождений текущего слова больше, чем текущее максимальное количество вхождений, то CountRepeatWord обновляется и устанавливается равным count
                //mostCommonWord = word; // Сохраняем текущее слово в переменной mostCommonWord, которая будет содержать наиболее часто встречающееся слово в тексте после выполнения цикла.
            }
        }
        //System.out.println(mostCommonWord); // для проверки
        return CountRepeatWord;
    }
}
