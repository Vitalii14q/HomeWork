package test;

public class Main {
    public static void main(String[] args) {
        int[] arrays = {2, 3, 4, 5, 6};
        for (int i = 0; i < arrays.length; i++) {
            System.out.print(i); //выводим индексы
        }
        System.out.println();

        for (int i = 0; i < arrays.length; i++) {
            System.out.print(arrays[i]); //выводим элементы
        }
        System.out.println();

        for(int number : arrays) {
            System.out.print(number); //выводим элементы
        }

    }
}
