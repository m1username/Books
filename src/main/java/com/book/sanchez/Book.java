package main.java.com.book.sanchez;

import java.util.ArrayList;
import java.util.List;

public class Book {

    private String author;
    private Cover cover;
    private List<Page> pages = new ArrayList<>();

    public Book(Cover cover, String author) {
        this.cover = cover;
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Cover getCover() {
        return cover;
    }

    public void setCover(Cover cover) {
        this.cover = cover;
    }

    public List<Page> getPages() {
        return pages;
    }

    public void setPages(List<Page> pages) {
        this.pages = pages;
    }

    // переопределение метода toString()
    @Override
    public String toString() {
        return "Book author: " + author + ", number of pages: " + pages.size() + ", cover is: "
                + cover.getColor() + " and " + (cover.isSoft() ? "soft" : "hard");
    }
}
