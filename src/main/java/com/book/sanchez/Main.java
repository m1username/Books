
package main.java.com.book.sanchez;


import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Book book = new Book();
        Cover cover = new Cover();
        cover.setColor("black");
        cover.setSoft(true);

        book.setCover(cover);

        Page page = new Page();
        page.setText("New text of first book");

        List<Page> pages = new ArrayList<>();
        pages.add(page);
        book.setPages(pages);
        book.setAuthor("Shewchenko");

        ////////////////////
        Book book2 = new Book();
        Cover cover2 = new Cover();
        cover2.setColor("green");
        cover2.setSoft(false);

        book2.setCover(cover2);

        Page page2 = new Page();
        page2.setText("New text of second book");
        Page page21 = new Page();
        page21.setText("Another text of second book");

        List<Page> pages2 = new ArrayList<>();
        pages2.add(page2);
        pages2.add(page21);
        book2.setPages(pages2);

        book2.setAuthor("Block");

        System.out.println(book.toString());
        System.out.println(book2.toString());
    }
}
