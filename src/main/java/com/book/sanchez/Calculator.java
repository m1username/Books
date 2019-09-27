package com.book.sanchez;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Calculator {
    public static double getSum(double a, double b) {
        return a + b;
    }

    public static double getSubtraction(double a, double b) {
        return a - b;
    }

    public static double getMultiple(double a, double b) {
        return a * b;
    }

    public static double getDivide(double a, double b) {
        return a / b;
    }

    public static double getExponentiation(double a, double b) {
        return Math.pow(a, b); //возведение в степень
    }

    public static double getRoot(double a, double b) {
        return Math.pow(a, 1.0 / b); //корень числа
    }

    public static double calculate(String formula) {

        String regex = "(\\d+\\.?\\d?)\\s?([+\\-*/^#])\\s?(\\d+\\.?\\d?)";

        if (!formula.matches(regex)) {
            throw new UnsupportedOperationException(formula + " not a valid formula");
        }

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(formula);

        matcher.matches();

        String symbol = matcher.group(2);
        double number1 = Double.parseDouble(matcher.group(1));
        double number2 = Double.parseDouble(matcher.group(3));

        double value = 0.0;

        switch (symbol) {
            case "+":
                value = getSum(number1, number2);
                break;
            case "-":
                value = getSubtraction(number1, number2);
                break;
            case "*":
                value = getMultiple(number1, number2);
                break;
            case "/":
                value = getDivide(number1, number2);
                break;
            case "^":
                value = getExponentiation(number1, number2);
                break;
            case "#":
                value = getRoot(number1, number2);
                break;
            default:
                throw new RuntimeException(value + " isn't a valid case");
        }
        return value;
    }
}