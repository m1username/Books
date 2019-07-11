
package com.book.sanchez;

import com.google.common.collect.ImmutableList;

public class Main {
    public static void main(String[] args) {

        //book
        Book book = new Book.Builder()
                .withCover(new Cover())
                .withAuthor("Shewchenko")
                .withPages(PageFactory.createPageList(ImmutableList.of("text")))
                .build();

        //book2
        Book book2 = new Book.Builder()
                .withCover(new Cover("green", true))
                .withAuthor("Block")
                .withPages(PageFactory.createPageList(ImmutableList.of("text", "text1")))
                .build();

        //book3
        Book book3 = new Book.Builder()
                .withCover(new Cover())
                .withAuthor("Skovoroda")
                .withPages(PageFactory.createPageList(ImmutableList.of("text", "text1", "text2")))
                .build();

        System.out.println(book.toString());
        System.out.println(book2.toString());
        System.out.println(book3.toString());
    }
}
