package com.book.sanchez;

public class Square extends Figure {

    public Square(){}

    public Square(int [] a, int [] b){}

    @Override
    public double getArea() {
        return Math.pow(getLength(), 2);
    }
}
