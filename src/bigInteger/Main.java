package bigInteger;

public class Main {
    public static void main(String[] args) {
        BigInteger bigInteger = new BigInteger("00205");
        BigInteger bigInteger1 = new BigInteger("0350");
        BigInteger result = bigInteger.add(bigInteger1);
        System.out.println(result);
        System.out.println(bigInteger);
        System.out.println(bigInteger1);
        System.out.println(bigInteger.multiplication(3));

    }
}


