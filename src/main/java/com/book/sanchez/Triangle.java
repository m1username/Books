package com.book.sanchez;

public class Triangle extends Figure {

    public Triangle(){}

    public Triangle(int [] a, int [] b){}

    @Override
    public double getArea() {
        return (Math.pow(getLength(), 2)) / 2;
    }
}