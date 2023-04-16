package problemSecond.array;

public class CreateArray {

    public void createAnEmptyArray() {
        int []array = new int[5]; // мы создаем массив при помощи ключевого слова new и указываем количество элементов этого массива.
        array[0] = 5; //указываем что будет хранить в нашем массиве под каждым индексом.
        array[1] = 4;
        array[2] = 3;
        array[3] = 2;
        array[4] = 1;
        System.out.println(array[3]); // выводим в принт элемент массива под индексом [3].
    }

    public void createFilledArray() {
        int []array = {1, 2, 3, 4, 5}; // мы создаем массив в котором указываем значения элемента и его длину.
        System.out.println(array[0]); // получаем нужный нам элемент массива.
    }

}
