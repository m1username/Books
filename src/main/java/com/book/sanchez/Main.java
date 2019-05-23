
package main.java.com.book.sanchez;


import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //book
        Book book = new Book(new Cover(), "Shewchenko");
        Page page = new Page("New text of first book");

        List<Page> pages = new ArrayList<>();
        pages.add(page);
        book.setPages(pages);

        //book2
        Book book2 = new Book(new Cover("green", true), "Block");
        Page page2 = new Page("New text of first book");
        Page page21 = new Page("Another text of second book");

        List<Page> pages2 = new ArrayList<>();
        pages2.add(page2);
        pages2.add(page21);
        book2.setPages(pages2);

        //book3
        Book book3 = new Book(new Cover(), "Skovoroda");
        Page page3 = new Page("New text of third book");
        Page page31 = new Page("Another text of third book");
        Page page32 = new Page("More text of third book");

        List<Page> pages3 = new ArrayList<>();
        pages3.add(page3);
        pages3.add(page31);
        pages3.add(page32);
        book3.setPages(pages3);

        System.out.println(book.toString());
        System.out.println(book2.toString());
        System.out.println(book3.toString());
    }
}
