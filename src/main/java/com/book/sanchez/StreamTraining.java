package com.book.sanchez;

import java.util.List;
import java.util.stream.Collectors;

public class StreamTraining {

    public static String listToString(List<Integer> numbers){

        return numbers.stream().filter((p) -> p % 2 == 0).map(String::valueOf).collect(Collectors.joining(", "));

    }
}
