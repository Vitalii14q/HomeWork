package NewArrays;

public class Task3 {
    /**
     * Сумма элементов частей массива
     */
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6};

        int firstIndex = 3;    //указываем индекс с которого начнем сложения
        int lastIndex = 5;    //указываем индекс до которого будем делать сложения
        int sum = 0;     //в этой переменной будем хранить результат сложения

        for (int i = firstIndex; i <= lastIndex ; i++) {    //условия, пока lastIndex больше firsIndex увеличиваем индекс
            sum += numbers[i];    //складываем индексы полученные в цикле
        }
        System.out.println(sum);
    }
}
