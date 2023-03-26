package bigInteger;

public class BigInteger {
    private final byte[] number;

    public BigInteger (String number) {
        this.number = new byte[number.length()];
        for (int i = 0; i < number.length(); i++) {
            this.number[i] = Byte.parseByte(String.valueOf(number.charAt(i)));
        }
    }

    /*public BigInteger add (BigInteger other) {
        byte[] result = new byte[number.length + 1];

        int thisIndex = this.number.length - 1;
        int otherIndex = other.number.length - 1;
        int resultIndex = result.length - 1;
        for (int i = otherIndex; i >= 0; i--) {
            result[resultIndex] = (byte) (this.number[thisIndex] + other.number[otherIndex]);
        }

    }*/
}
