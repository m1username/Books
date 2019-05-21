
package main.java.com.book.sanchez;


import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //book
        Book book = new Book();
        Cover cover = new Cover();
        cover.setColor("black");
        cover.setSoft(false);

        book.setCover(cover);

        Page page = new Page();
        page.setText("New text of first book");

        List<Page> pages = new ArrayList<>();
        pages.add(page);
        book.setPages(pages);
        book.setAuthor("Shewchenko");

        //book2
        Book book2 = new Book();
        Cover cover2 = new Cover();
        cover2.setColor("black");
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

        //book3
        Book book3 = new Book();
        Cover cover3 = new Cover();
        cover3.setColor("black");
        cover3.setSoft(false);

        book3.setCover(cover2);

        Page page3 = new Page();
        page3.setText("New text of third book");
        Page page31 = new Page();
        page31.setText("Another text of third book");
        Page page32 = new Page();
        page32.setText("More text of third book");

        List<Page> pages3 = new ArrayList<>();
        pages3.add(page3);
        pages3.add(page31);
        pages3.add(page32);
        book3.setPages(pages3);

        book3.setAuthor("Skovoroda");

        System.out.println(book.toString());
        System.out.println(book2.toString());
        System.out.println(book3.toString());
    }
}
