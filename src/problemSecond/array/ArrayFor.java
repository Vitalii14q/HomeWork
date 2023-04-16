package problemSecond.array;

/**
 * часто используемый цикл для обработки массива.
 */

public class ArrayFor {

    public void fillingArray () {
        int []array = new int[5];

        for (int i = 0; i < array.length; i++) { // идем по длине массива и заполняем его элементами с одного до пяти.
            array[i] = i + 1;
            System.out.print(array[i]); //запоминаем каждый индекс и роняем его дальше в принт.
        }
        System.out.println();
    }

    public void fillingArrayRevers () {
        int []array = new int[5];

        for(int i = array.length - 1; i >= 0; i--) { //идем по массиву с последнего индекса и заполняем его
            array[i] = i * 10;
            System.out.print(array[i]);
        }
        System.out.println();
    }
}
