package abhyas.dayX.Assignment2;

import java.math.BigInteger;

public class FactorialExample {
    static BigInteger fact(int x) {
        if(x<1) {
            System.out.println("negative values are not allowed");

        }
         else if(x==1) return BigInteger.ONE;
         return BigInteger.valueOf(x).multiply(fact(x-1));
    }

    public static void main(String[] args) {
        try {
            BigInteger x = fact(-24);
            System.out.println(x);
        } catch (StackOverflowError e) {
            System.out.println("Stack is full");
        }
    }
}
