
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

        System.out.println(book.toString());


    }


}
