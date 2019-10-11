package com.book.sanchez;

public class Circle extends Figure {

    public Circle(){}

    public Circle(int [] a, int [] b){}

    @Override
    public double getArea() {
        return 3.14 * Math.pow(getLength(), 2);
    }
}
