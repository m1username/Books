package com.book.sanchez;

public class Triangle extends Figure {

    private int getLength() {
        return pointA[0] - pointB[0];
    }

    enum Direction {
        UP,
        DOWN,
        LEFT,
        RIGHT
    }

    @Override
    public void move(int distance, String direction) {
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

    @Override
    public double getArea() {
        return (Math.pow(getLength(), 2)) / 2;
    }

    @Override
    public void changeSize(int k) {
        pointA[0] -= k;
        pointB[0] += k;
    }
}