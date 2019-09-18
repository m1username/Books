package com.book.sanchez;

public class Calculator {
    public static double getSum(double a, double b) {
        return a+b;
    }

    public static double getSubtraction(double a, double b) {
        return a-b;
    }

    public static double getMultiple(double a, double b) {
        return a*b;
    }

    public static double getDivide(double a, double b) {
        return a/b;
    }

    public static double getExponentiation(double a, double b) {
        return Math.pow(a, b);
    }

    public static double getSquareRoot(double a, double b) {
        return Math.pow(a, 1.0/b);
    }
}
