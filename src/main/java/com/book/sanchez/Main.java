
package com.book.sanchez;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> texts = new ArrayList<>();
        texts.add("text");

        List<String> texts2 = new ArrayList<>();
        texts2.add("text");
        texts2.add("text");

        List<String> texts3 = new ArrayList<>();
        texts3.add("text");
        texts3.add("text");
        texts3.add("text");

        //book
        Book book = new Book.Builder()
                .withCover(new Cover())
                .withAuthor("Shewchenko")
                .withPages(PageFactory.createPageList(texts))
                .build();

        //book2
        Book book2 = new Book.Builder()
                .withCover(new Cover("green", true))
                .withAuthor("Block")
                .withPages(PageFactory.createPageList(texts2))
                .build();

        //book3
        Book book3 = new Book.Builder()
                .withCover(new Cover())
                .withAuthor("Skovoroda")
                .withPages(PageFactory.createPageList(texts3))
                .build();

        System.out.println(book.toString());
        System.out.println(book2.toString());
        System.out.println(book3.toString());
    }
}
