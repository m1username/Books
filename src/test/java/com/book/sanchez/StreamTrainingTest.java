package com.book.sanchez;

import org.junit.Test;
import java.util.ArrayList;
import java.util.Arrays;
import static org.junit.Assert.*;

public class StreamTrainingTest {

    @Test
    public void listToString() {

        String numbers = "2, 6, 8, 200, 480, 500";

        assertEquals(numbers, StreamTraining.listToString(new ArrayList(Arrays.asList(2, 5, 6, 7, 8, 200, 301, 403, 480, 500))));

    }
}