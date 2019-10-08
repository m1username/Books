package com.book.sanchez;

public class Triangle extends Figure {

    @Override
    public double getArea() {
        return (Math.pow(getLength(), 2)) / 2;
    }
}