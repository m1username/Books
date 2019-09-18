package com.book.sanchez;

import com.google.common.collect.ImmutableList;
import org.junit.Test;

import java.util.*;

import static org.junit.Assert.assertEquals;

import java.util.List;

public class StreamTrainingTest {

    @Test
    public void listToString() {
        String numbers = "2, 6, 8, 200, 480, 500";
        assertEquals(numbers, StreamTraining.listToString(Arrays.asList(2, 5, 6, 7, 8, 200, 301, 403, 480, 500)));
    }

    @Test
    public void countBooks() {

        Book book11 = new Book.Builder()
                .withCover(new Cover())
                .withAuthor("Shewchenko")
                .withPages(PageFactory.createPageList(ImmutableList.of("text")))
                .build();

        Book book22 = new Book.Builder()
                .withCover(new Cover())
                .withAuthor("Shewchenko")
                .withPages(PageFactory.createPageList(ImmutableList.of("text")))
                .build();

        Book book33 = new Book.Builder()
                .withCover(new Cover("green", true))
                .withAuthor("Block")
                .withPages(PageFactory.createPageList(ImmutableList.of("text", "text1")))
                .build();

        ArrayList<Book> bookList = new ArrayList<>();
        bookList.add(book11);
        bookList.add(book22);
        bookList.add(book33);

        HashMap<Integer, List<Book>> myHashMap = new HashMap<>();
        myHashMap.put(2, ImmutableList.of(book11, book22));
        myHashMap.put(1, ImmutableList.of(book33));

        assertEquals(myHashMap, StreamTraining.countBooks(bookList));
    }
}