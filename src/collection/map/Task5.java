package collection.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Дан текст. Необходимо определить частоту вхождения каждого слова и вывести эту информацию
 * в порядке убывания по количеству вхождений
 */

public class Task5 {

    public static void main(String[] args) {
        System.out.println(findTheMostCommonWord("Привет привет привет идти идти как быть куда и почему привет привет"));
    }

    public static List<Map.Entry<String, Integer>> findTheMostCommonWord (String text) {
        HashMap<String, Integer> wordCount = new HashMap<>(); // создаем объект HashMap для хранения количества вхождений каждого слова

        String words[] = text.replaceAll("\\p{Punct}", "").toLowerCase().split("\\s+"); // создаем массив строк words, который получается путем замены всех знаков препинания и приведения текста к нижнему регистру, а затем разбиения строки на отдельные слова с помощью метода split()

        for (String word : words) { // создаем цикл for each, который перебирает все слова массива words
            Integer count = wordCount.get(word);
            if (count != null) { // если слово уже есть в HashMap, то увеличиваем его значение на 1
                wordCount.put(word, count + 1);
            } else {
                wordCount.put(word, 1); // иначе добавляем его в HashMap с начальным значением 1
            }
        }

        return sortAndConvertToList(wordCount);
    }

    public static List<Map.Entry<String, Integer>> sortAndConvertToList (HashMap <String, Integer> counterRepeatWordRepetitions) {
        List <Map.Entry<String, Integer>> list = new ArrayList<>(counterRepeatWordRepetitions.entrySet());
        list.sort(new EntryComparator());

        return list;
    }
}
