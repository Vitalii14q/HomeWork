package collection.map;

import java.util.*;

/**
 * Найти три самых повторяющихся слова в тексте
 */

public class Task6 {
    public static void main(String[] args) {
        List<Map.Entry<String, Integer>> sortedList = findTheMostCommonWord("Привет привет привет идти идти как быть куда и почему привет привет как куда зачем и почему и так привет как");
        System.out.println(findTop3RepeatWord(sortedList));
        System.out.println(findTheMostCommonWord("Привет привет привет идти идти как быть куда и почему привет привет как куда зачем и почему и так привет как"));
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

    public static List<String> findTop3RepeatWord (List <Map.Entry<String, Integer>> sortList) {
        List<String> top3Words = new ArrayList<>();
        int countWord = 0;
        for (Map.Entry<String, Integer> entry : sortList) {
            if (countWord == 3 || entry.getValue() == 1) {
                break;
            }
            top3Words.add(entry.getKey());
            countWord++;
        }
        return top3Words;
    }
}
