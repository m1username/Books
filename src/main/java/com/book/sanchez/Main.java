
package com.book.sanchez;

public class Main {
    public static void main(String[] args) {
        //book
        Book book = new Book.Builder()
                .withCover(new Cover())
                .withAuthor("Shewchenko")
                .withPages(Util.getPages(new Page("text")))
                .build();

        //book2
        Book book2 = new Book.Builder()
                .withCover(new Cover("green", true))
                .withAuthor("Block")
                .withPages(Util.getPages(new Page("text"), new Page("text")))
                .build();

        //book3
        Book book3 = new Book.Builder()
                .withCover(new Cover())
                .withAuthor("Skovoroda")
                .withPages(Util.getPages(new Page("text"), new Page("text"), new Page("text")))
                .build();

        System.out.println(book.toString());
        System.out.println(book2.toString());
        System.out.println(book3.toString());
    }
}
