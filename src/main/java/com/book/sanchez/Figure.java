package com.book.sanchez;

public abstract class Figure {
    int [] pointA =  new int[2];
    int [] pointB =  new int[2];

    public abstract void move(int distance, String direction);

    public abstract double getArea();

    public abstract void changeSize(int k);
}
