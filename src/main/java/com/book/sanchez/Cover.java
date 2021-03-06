package com.book.sanchez;

public class Cover {
    private String color;
    private boolean isSoft;

    Cover() {
        this.color = "black";
        this.isSoft = false;
    }

    Cover(String color, boolean isSoft) {
        this.color = color;
        this.isSoft = isSoft;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isSoft() {
        return isSoft;
    }

    public void setSoft(boolean soft) {
        isSoft = soft;
    }
}
