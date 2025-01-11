package com.htt.java;

import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
        String multiply = multiply("2", "3");
        System.out.println(multiply);
    }
    public static String multiply(String num1, String num2) {
        BigInteger bigInteger1 = BigInteger.valueOf(Long.parseLong(num1));
        BigInteger bigInteger2 = BigInteger.valueOf(Long.parseLong(num2));
        int i = bigInteger1.intValue();
        int j = bigInteger2.intValue();
        return String.valueOf(i*j);
    }
}