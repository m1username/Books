package main.java.com.book.sanchez;

public class Page {
    private String text;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
        text = "New text of new book";
    }
}
