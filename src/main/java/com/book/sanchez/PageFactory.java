package com.book.sanchez;

import java.util.ArrayList;
import java.util.List;

public class PageFactory {
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

    /*public static List<Page> createPageList(List<String> texts) {
        new Page("text1");
        new Page("text2");
        new Page("text3");
        return texts;
    }*/
}