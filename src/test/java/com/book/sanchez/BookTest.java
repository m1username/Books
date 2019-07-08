package com.book.sanchez;

import org.junit.Assert;
import org.junit.Test;

public class BookTest {

    @Test
    public void toStringTest() {

        Book bookTest = new Book.Builder()
                .withCover(new Cover())
                .withAuthor("Shewchenko")
                .withPages(Util.getPages(new Page("text")))
                .build();

        //запускаем тест
        Assert.assertEquals("Book author: Shewchenko, number of pages: 1, cover is: black and hard", bookTest.toString());
    }
}