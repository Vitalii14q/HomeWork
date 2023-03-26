package problemSecond;

/**
 * Статические члены класса - это члены класса, которые относятся к самому классу, а не к конкретному экземпляру этого класса.
 * То есть, если мы создаем несколько объектов одного класса, то у каждого объекта будет своя копия всех обычных
 * (нестатических) полей и методов, но статические поля и методы будут общими для всех объектов этого класса.
 * Статические поля обычно используются для хранения общей информации, которая должна быть доступна для всех
 * экземпляров класса, например, счетчик количества созданных объектов класса. Статические методы используются
 * для реализации общей функциональности, которая не зависит от конкретных данных экземпляра класса.
 */

// поля
public class People { // поля нужны для того что бы пользователь не смог создать объект класс, не проинициализировав данные параметры.
    private static int count = 0; // Статические поля класса имеют одно и то же значение для всех объектов этого класса.
    private String name;
    private String skinColor;
    private int age;
    private int weight;
    private int height;

    //конструктор
    public People (String name, String skinColor, int age, int weight, int height) { //Конструктор класса - это специальный метод, который используется для инициализации объектов класса и вызывается с помощью ключевого слова new.
        this.name = name; //ключевое слово this используется для ссылки на текущий класс с учетом метода или конструктора экземпляра.
        this.skinColor = skinColor;
        this.age = age;
        this.weight = weight;
        this.height = height;
        count ++; // увеличиваем счетчик при создании каждого объекта класса People
    }

    public static int getCount () { //статический метод
        return count;
    }

    public String getName() { //получим имя объекта
        return name;
    }

    public String setName(String name) {
        return "Имя: " + name; // можем поменять имя
    }

    public String getSkinColor () {
        return skinColor;
    }

    public String setSkinColor (String skinColor) {
        return "Цвет кожи: " + skinColor;
    }

    public int getAge () {
        return age;
    }

    public  int setAge (int age) {
        return age;
    }

    public int getWeight () {
        return weight;
    }

    public  int setWeight (int weight) {
        return weight;
    }

    public int getHeight () {
        return height;
    }

    public  int setHeight (int height) {
        return height;
    }

    public String toString () { // выведем в консоль все данные о человеке.
        return "Имя: " + name + "\n" + "Цвет кожи: " + skinColor + "\n" + "Возраст: " + age + "\n" + "Вес: " + weight + "\n" + "Рост: " + height;
    }
}
