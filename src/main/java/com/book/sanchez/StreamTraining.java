package com.book.sanchez;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.toList;

public class StreamTraining {
    public static String listToString(List<Integer> numbers) {
        return numbers.stream().filter(p -> p % 2 == 0).map(String::valueOf).collect(Collectors.joining(", "));
    }

    public static Map<Integer, List<Book>> countBooks(List<Book> books) {

        Map<String, List<Book>> result = books.stream().collect(
                groupingBy(Book::getAuthor, toList()));

        Map<Integer, List<Book>> result2 = result.values().stream().collect(
                Collectors.toMap(value -> value.size(), value -> value));

        return result2;
    }
}