package leetcode;

public class TwoSum {
    String task = "\n" +
            "Учитывая массив целых чисел numbs и целое число target,\n" +
            "верните индексы двух чисел так, чтобы они составляли в сумме target.\n" +
            "Вы можете предположить, что каждый вход будет иметь ровно одно решение,\n" +
            "и вы не можете использовать один и тот же элемент дважды.";

    public int[] twoSum(int[] numbs, int target) {
        int[] indices = new int[2];
        for (int i = 0; i < numbs.length; i++) {
            for (int j = i + 1; j < numbs.length; j++) {
                if (numbs[i] + numbs[j] == target) {
                    indices[0] = i;
                    indices[1] = j;
                    return indices;
                }
            }
        }
        return indices;
    }

}
