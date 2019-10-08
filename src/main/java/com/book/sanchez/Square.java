package com.book.sanchez;

public class Square extends Figure {

    @Override
    public double getArea() {
        return Math.pow(getLength(), 2);
    }
}
