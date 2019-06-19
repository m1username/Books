package com.book.sanchez;

import java.util.List;

public class Book {

    private String author;
    private Cover cover;
    private List<Page> pages;

    private Book() {
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

    public static class Builder {
        private Book newBook;

        public Builder() {
            newBook = new Book();
        }

        public Builder withAuthor(String author) {
            newBook.author = author;
            return this;
        }

        public Builder withCover(Cover cover) {
            newBook.cover = cover;
            return this;
        }

        public Builder withPages(List<Page> pages) {
            newBook.pages = pages;
            return this;
        }

        public Book build() {
            return newBook;
        }
    }
}