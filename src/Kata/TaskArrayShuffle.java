package Kata;

public class TaskArrayShuffle {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {6, 7, 8, 9, 10};
        int[] dubleShuffled = shuffle(array1, array2);

        int sum = 0;
        for (int i = 0; i < dubleShuffled.length; i++) {
            sum += dubleShuffled[i];
        }
        System.out.println(sum);
        for (int i = 0; i < dubleShuffled.length; i++) {
            System.out.print(dubleShuffled[i] + " ");
        }
    }

    static int[] shuffle (int[] array1, int[] array2) {
        int[] shuffled = new int[array1.length + array2.length];

        for (int i = 0; i < array1.length; i++) {
            shuffled[i * 2] = array1[i];
            shuffled[i * 2 + 1] = array2[i];
        }
        return shuffled;
    }

/*    static int[] splitAndShuffle(int[] array) {
        int[] array1 = new int [array.length / 2];
        int[] array2 = new int [array.length / 2];

        for (int i = 0; i < array.length / 2; i++) {
            array1[i] = array[i];
        }
        for (int i = array.length / 2; i < array.length; i++) {
            array2[i - array.length /2] = array[i];
        }
        return;
    }*/
}
