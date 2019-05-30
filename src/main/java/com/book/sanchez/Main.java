
package main.java.com.book.sanchez;


import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //book

        List<Page> pages = new ArrayList<>();
        Book book = new Book(new Cover(), "Shewchenko", pages);
        Page page = new Page("New text of first book");
        pages.add(page);

        //book2
        List<Page> pages2 = new ArrayList<>();
        Book book2 = new Book(new Cover("green", true), "Block", pages2);
        Page page2 = new Page("New text of first book");
        Page page21 = new Page("Another text of second book");
        pages2.add(page2);
        pages2.add(page21);

        //book3
        List<Page> pages3 = new ArrayList<>();
        Book book3 = new Book(new Cover(), "Skovoroda", pages3);
        Page page3 = new Page("New text of third book");
        Page page31 = new Page("Another text of third book");
        Page page32 = new Page("More text of third book");

        pages3.add(page3);
        pages3.add(page31);
        pages3.add(page32);

        System.out.println(book.toString());
        System.out.println(book2.toString());
        System.out.println(book3.toString());
    }
}
