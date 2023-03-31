/*
package bigInteger;

public class BigInteger {
    private final byte[] number;

    public BigInteger (String number) {
        this.number = new byte[number.length()];
        for (int i = 0; i < number.length(); i++) {
            this.number[i] = Byte.parseByte(String.valueOf(number.charAt(i)));
        }
    }

    private BigInteger () {
    }

    public BigInteger add (BigInteger other) {
        byte[] result = new byte[number.length + 1];

        int thisIndex = this.number.length - 1;
        int otherIndex = other.number.length - 1;
        int resultIndex = result.length - 1;
        for (int i = otherIndex; i >= 0; i--) {
            result[resultIndex] = (byte) (this.number[thisIndex] + other.number[otherIndex]);
            thisIndex--;
            otherIndex--;
            resultIndex--;
        }
        for (int i = result.length - 1; i > 0; i--) {
            result[i - 1] += result[i] / 10;
            result[i] %= 10;
        }
        return new BigInteger();
    }

    private byte [] deleteLeadingZero (byte [] number) {
        if (number[0] != 0) {
            return number;
        }
        byte []result = new byte[number.length - 1];
        for (int i = 1; i < result.length; i ++) {
            result[i - 1] = number[i];
        }
        return result;
    }
}
 */
