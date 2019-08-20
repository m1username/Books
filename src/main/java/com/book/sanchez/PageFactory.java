package com.book.sanchez;

import java.util.List;
import java.util.stream.Collectors;

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
        return texts.stream().map(str -> new Page(str)).collect(Collectors.toList());
    }
}