package com.book.sanchez;

import java.util.Objects;

public class Page {
    private String text;

    public Page(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Page page = (Page) o;
        return Objects.equals(text, page.text);
    }

    @Override
    public int hashCode() {
        return Objects.hash(text);
    }

}