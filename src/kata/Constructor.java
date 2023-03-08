package kata;

public class Constructor {
    public static void main(String[] args) {
        Human human1 = new Human("Bob",40);  //new Human тут мы вызываем конструктор
        Car car1 = new Car("black", 4);
        //Car car = new Car("bbb",4);
        oldCar(car1);
        int b = 5;
        age(b);
        Clock clock = new Clock(1,1);
        Clock min = clock.addMinutes(1);
        System.out.println(min);
        Clock time = clock.addClocks(clock);
        System.out.println(time);


        //System.out.println(clock); // результат сложения двух объектов плюс мы добавляем доп миинуты
        //LocalTime time = LocalTime.of(clock.getHours(), clock.getMinutes()); //   это описание местного времени
        //DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm"); // шаблон времени
        //System.out.println(time.format(formatter));
        //System.out.println(clock);

    }

    static void age(int x){
        x = 8;
    }

    static void oldCar(Car car){

    }

    static class Human {
        private String name; // поля. назначаем с помощью Get and set
        private int age; // поля. назначаем с помощью Get and set

        public Human() { // пустой конструктор, без входных параметров
            System.out.println("Hello from first constructor");
        }

        public Human (String name){ //при вызове этого конструктора мы сможем присвоить имя нашему объекту
            System.out.println("Hello from second constructor");
            this.name = name;
        }

        private Human (String name, int age) {
            System.out.println("Hello from third constructor");
            this.name = name;
            this.age = age;
        }



        public void setName(String name) {
            this.name = name;
        }

        public void setAge(int age) {
            this.age = age;
        }

    }
}
