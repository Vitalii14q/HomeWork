package test;

public class Main2 {
    public static void main(String[] args) {
        int a = 1;
        int b = 0;

        try {
            System.out.println(divide(-1,1));
        } catch (Exception e) {
            System.out.println("a не может быть нолем");
        }
    }

    public static int divide(int a, int b) throws AIsNegativeException {

        if (a < 0) {
            throw new AIsNegativeException("a не может быть нолем");
        }
        return a / b;
    }
}
