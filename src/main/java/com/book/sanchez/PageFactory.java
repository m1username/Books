package com.book.sanchez;

import java.util.ArrayList;
import java.util.List;
import com.google.common.collect.ImmutableList;


public class PageFactory {
    public static List<Page> getPages(Page page) {
        return ImmutableList.of(page);
    }

    public static List<Page> getPages(Page page, Page page2) {

        return ImmutableList.of(page, page2);
    }

    public static List<Page> getPages(Page page, Page page2, Page page3) {
        return ImmutableList.of(page, page2, page3);
    }

    public static List<Page> createPageList(List<String> texts) {
        List<Page> PageList = new ArrayList<>();
        for (String text : texts) {
            PageList.add(new Page(text));
        }
        return PageList;
    }
}