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

    public static double getRoot(double a, double b) {
        return Math.pow(a, 1.0/b);
    }

    public static double calculate(String a) {
        return 0.0;
    }
}


    /*Создавай в классе Calculator метод
        double calculate(String);
        1. метод принимает строку вида "цифразнакцифра" (5+1)
        2. ты строку эту парсишь получаешь первый, второй параметр и в зависимости от знака вызываешь один из уже существующих методов.
        3. знаки +, -, *, /, ^ (степень), для корня сам придумаешь
        4. если строка не соответствует метод бросает UnsupportedOperationException
        5. парсить regex'ом
        6. на метод пишешь 7 тестов - по одному на каждый знак и + 1 негативный для неправильной строки
        7. возвращаешь результат вычислений*/