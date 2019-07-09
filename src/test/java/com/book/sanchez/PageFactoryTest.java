package com.book.sanchez;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class PageFactoryTest {

    @Test
    public void createPageList() {

        List<Page> expectedPageList = new ArrayList<>();
        expectedPageList.add(new Page("text1"));
        expectedPageList.add(new Page("text2"));
        expectedPageList.add(new Page("text3"));

        List<String> texts = new ArrayList<>();
        texts.add("text1");
        texts.add("text2");
        texts.add("text3");

        List<Page> actualPageList = PageFactory.createPageList(texts);

        Assert.assertEquals(expectedPageList.size(), actualPageList.size());

        for (int i = 0; i < actualPageList.size(); i++) {
            Assert.assertEquals(expectedPageList.get(i).getText(), actualPageList.get(i).getText());
        }
    }
}