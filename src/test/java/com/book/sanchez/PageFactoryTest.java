package com.book.sanchez;

import org.junit.Test;
import com.google.common.collect.ImmutableList;
import java.util.List;
import static org.junit.Assert.assertEquals;

public class PageFactoryTest {

    @Test
    public void createPageListTest() {

        List<Page> expectedPageList = ImmutableList.of(new Page("text1"), new Page("text2"), new Page("text3"));

        assertEquals(expectedPageList, PageFactory.createPageList(ImmutableList.of("text1", "text2", "text3")));
    }

    @Test
    public void getPagesTest() {
        Page page = new Page("text");
        assertEquals(ImmutableList.of(page), PageFactory.getPages(page));
    }

    @Test
    public void getPages1Test() {
        Page page = new Page("text");
        Page page2 = new Page("text");
        assertEquals(ImmutableList.of(page, page2), PageFactory.getPages(page, page2));
    }

    @Test
    public void getPages2Test() {
        Page page = new Page("text");
        Page page2 = new Page("text");
        Page page3 = new Page("text");
        assertEquals(ImmutableList.of(page, page2, page3), PageFactory.getPages(page, page2, page3));
    }
}