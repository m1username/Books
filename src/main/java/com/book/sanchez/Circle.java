package com.book.sanchez;

public class Circle extends Figure {

    @Override
    public double getArea() {
        return 3.14 * Math.pow(getLength(), 2);
    }
}
