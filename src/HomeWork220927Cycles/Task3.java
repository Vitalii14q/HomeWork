package HomeWork220927Cycles;

public class Task3 {
    /**
     * Возвести число А в степень В
     */
    public static void main(String[] args) {
        int number = 2;
        int degree = 3;

        System.out.println(pow(number, degree));

    }

    static int pow(int number, int degree) {
        int res = 1;
        int i = 0;

        while (i < degree){
            res = res * number;
            i++;
        }
        return res;
    }
}
