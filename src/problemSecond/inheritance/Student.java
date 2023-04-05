package problemSecond.inheritance;

public class Student extends Person{ // с помощью ключевого слова extends мы обращаемся к родительскому классу и теперь нам доступны его свойства и методы.

    private String schoolName;

    public Student (String name, int age, String schoolName) {
        super(name, age); // с помощью ключевого слова super мы обращаемся к конструктору родительского класса.
        this.schoolName = schoolName;
    }

    public void study () {
        System.out.println("Student is studying");
    }

    @Override  // это аннотация в java показывает, что метод родительского класса изменен подклассом.
    public void work () { //после того как мы переопределили родительский метод, он принадлежит конкретно этому подклассу.
        System.out.println("I am a student and I am not working yet");
    }
}
