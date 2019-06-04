package main.java.com.book.sanchez;

import java.util.ArrayList;
import java.util.List;

public class Util {
    public static List<Page> getPages(Page page1) {
        List<Page> pages = new ArrayList<>();
        pages.add(page1);
        return pages;
    }

    public static List<Page> getPages(Page page1, Page page2) {
        List<Page> pages = new ArrayList<>();
        pages.add(page1);
        pages.add(page2);
        return pages;
    }

    public static List<Page> getPages(Page page1, Page page2, Page page3) {
        List<Page> pages = new ArrayList<>();
        pages.add(page1);
        pages.add(page2);
        pages.add(page3);
        return pages;
    }
}