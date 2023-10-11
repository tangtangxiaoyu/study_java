package chapter13;

import java.math.BigDecimal;
import java.math.BigInteger;

public class BigInteger_ {
    public static void main(String[] args) {
        BigInteger b1 = new BigInteger("99999999999999999");
        BigInteger b2 = new BigInteger("1");
        BigInteger b3 = b1.add(b2);
        System.out.println(b3);

        BigDecimal b4 = new BigDecimal(9.41254125452343545345343541523425425);
        System.out.println(b4);


    }
}
