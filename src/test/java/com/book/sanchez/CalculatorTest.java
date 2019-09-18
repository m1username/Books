package com.book.sanchez;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    @Test
    public void getSum() {

        assertEquals(6.0, Calculator.getSum(2.0,4.0), 0.1);
    }

    @Test
    public void getSubtraction() {
        assertEquals(2.0, Calculator.getSubtraction(4.0,2.0), 0.1);
    }

    @Test
    public void getMultiple() {
        assertEquals(8.0, Calculator.getMultiple(2.0,4.0), 0.1);
    }

    @Test
    public void getDivide() {
        assertEquals(2.0, Calculator.getDivide(4.0,2.0), 0.1);
    }

    @Test
    public void getExponentiation() {
        assertEquals(16.0, Calculator.getExponentiation(2.0,4.0), 0.1);
    }

    @Test
    public void getSquareRoot() {
        assertEquals(2.0, Calculator.getSquareRoot(64.0, 6.0), 0.1);
    }
}