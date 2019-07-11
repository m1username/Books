package com.book.sanchez;

import org.junit.Assert;
import org.junit.Test;
import com.google.common.collect.ImmutableList;

import java.util.List;

public class PageFactoryTest {

    @Test
    public void createPageList() {

        List<Page> expectedPageList = ImmutableList.of(new Page("text1"), new Page("text2"), new Page("text3"));

        List<String> texts = ImmutableList.of("text1", "text2", "text3");

        List<Page> actualPageList = PageFactory.createPageList(texts);

        Assert.assertEquals(expectedPageList.size(), actualPageList.size());

        for (int i = 0; i < actualPageList.size(); i++) {
            Assert.assertEquals(expectedPageList.get(i).getText(), actualPageList.get(i).getText());
        }
    }
}