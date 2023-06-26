package objectOop;

public class ElektrikCar {

    private String winCod;
    private String colour;
    private int power;
    private int d;

    public ElektrikCar (String winCod, String colour, int power, int d) {

        this.winCod = winCod;
        this.colour = colour;
        this.power = power;
        this.d = d;
    }

    public String getWinCod () {
        return winCod;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getColour () {
        return colour;
    }

    public  void setPower (int power) {
        this.power = power;
    }

    public int getPower () {
        return power;
    }

    public void setD (int d) {
        this.d = d;
    }

    public int getD () {
        return d;
    }

}
