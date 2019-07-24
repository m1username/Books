package com.book.sanchez;

import org.junit.Test;
import com.google.common.collect.ImmutableList;
import java.util.List;
import static org.junit.Assert.assertEquals;

public class PageFactoryTest {

    @Test
    public void createPageList() {

        List<Page> expectedPageList = ImmutableList.of(new Page("text1"), new Page("text2"), new Page("text3"));

        assertEquals(expectedPageList, PageFactory.createPageList(ImmutableList.of("text1", "text2", "text3")));
    }
}