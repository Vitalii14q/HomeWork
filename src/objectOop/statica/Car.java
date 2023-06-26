package objectOop.statica;

public class Car {

    private int km = 0;

    public int howKm () {
        km++;
        return km;

    }

    static String color (){
        String color = "black";
        return color;
    }
}
