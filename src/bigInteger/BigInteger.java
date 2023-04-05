package bigInteger;

import java.util.Arrays;

public class BigInteger {
    private final byte[] number;

    public  BigInteger (String number) {
        byte[] result = new byte[number.length()];
        for (int i = 0; i < number.length(); i++) {
            result[i] = Byte.parseByte(String.valueOf(number.charAt(i)));
        }
        this.number = deleteLeadingZero(result);
    }

    private BigInteger (byte []number) {
        this.number = deleteLeadingZero(number);
    }

    public BigInteger multiplication(long number) {
        BigInteger result = this;
        for (int i = 0; i < number - 1; i++) {
            result = result.add(this);
        }
        return result;
    }

    public BigInteger add (BigInteger other) {
        byte[] first = this.number;
        byte[] second = other.number;
        byte[] swap;
        if (second.length > first.length) {
            swap = second; // записываем в пустую переменную значение переменной second.
            second = first; //тут в переменную second записываем переменную first.
            first = swap; // а в первую переменную записываем значение second, но через переменную swap.


        }
        byte[] result = new byte[first.length + 1];

        int thisIndex = first.length - 1;
        int otherIndex = second.length - 1;
        int resultIndex = result.length - 1;
        for (int i = otherIndex; i >= 0; i--) {
            result[resultIndex] = (byte) (first[thisIndex] + second[otherIndex]);
            thisIndex--;
            otherIndex--;
            resultIndex--;
        }
        for (int i = result.length - 1; i > 0; i--) {
            result[i - 1] += result[i] / 10;
            result[i] %= 10;
        }
        return new BigInteger(result);
    }

    private byte [] deleteLeadingZero (byte [] number) {
        if (number[0] != 0) {
            return number;
        }
        int index = 0;
        for (int i = 0; i < number.length; i++){
            if (number[i] > 0) {
                index = i;
                break;
            }
        }

        byte [] result = new byte[number.length - index];
        for (int i = index; i < number.length; i++) {
            result[i - index] = number[i];
        }
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < number.length; i++) {
            sb.append(number[i]);
        }
        return sb.toString();
    }
}

