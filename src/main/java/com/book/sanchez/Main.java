
package main.java.com.book.sanchez;


import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //book
        List<Page> pages = new ArrayList<>();
        pages.add(new Page("New text of first book"));
        Book book = new Book(new Cover(), "Shewchenko", pages);

        //book2
        List<Page> pages2 = new ArrayList<>();
        pages2.add(new Page("New text of first book"));
        pages2.add(new Page("Another text of second book"));
        Book book2 = new Book(new Cover("green", true), "Block", pages2);

        //book3
        List<Page> pages3 = new ArrayList<>();
        pages3.add(new Page("New text of third book"));
        pages3.add(new Page("Another text of third book"));
        pages3.add(new Page("Another text of third book"));
        Book book3 = new Book(new Cover(), "Skovoroda", pages3);

        System.out.println(book.toString());
        System.out.println(book2.toString());
        System.out.println(book3.toString());
    }
}
