package com.book.sanchez;

public abstract class Figure {
    int [] pointA =  new int[2];
    int [] pointB =  new int[2];

    public int getLength() {
        return pointA[0] - pointB[0];
    }

    public void move(int distance, String direction){
        if (direction.equals("UP")) {
            pointA[1] = pointB[1] = pointA[1] + distance;
        } else if (direction.equals("DOWN")) {
            pointA[1] = pointB[1] = pointA[1] - distance;
        } else if (direction.equals("LEFT")) {
            pointA[0] = pointB[0] = pointA[0] - distance;
        } else if (direction.equals("RIGHT")) {
            pointA[0] = pointB[0] = pointA[0] + distance;
        }
    }

    public abstract double getArea();

    public void changeSize(int k){
        pointA[0] -= k;
        pointB[0] += k;
    }
}
