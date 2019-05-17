package main.java.com.book.sanchez;

public class Cover {
    private String color;
    private boolean isSoft;
    private boolean isHard;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
        color = "black"; //???
    }

    public boolean isSoft() {
        return isSoft;
    }

    public void setSoft(boolean soft) {
        isSoft = soft;
        //soft = true;
    }

    public boolean isHard() {
        return isHard;
    }

    public void isHard(boolean hard) {
        isHard = hard;
        hard = true;
    }

}
