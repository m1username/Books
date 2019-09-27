package com.book.sanchez;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    @Test
    public void getSum() {
        assertEquals(6.0, Calculator.getSum(2.0, 4.0), 0.1);
    }

    @Test
    public void getSubtraction() {
        assertEquals(2.0, Calculator.getSubtraction(4.0, 2.0), 0.1);
    }

    @Test
    public void getMultiple() {
        assertEquals(8.0, Calculator.getMultiple(2.0, 4.0), 0.1);
    }

    @Test
    public void getDivide() {
        assertEquals(2.0, Calculator.getDivide(4.0, 2.0), 0.1);
    }

    @Test
    public void getExponentiation() {
        assertEquals(16.0, Calculator.getExponentiation(2.0, 4.0), 0.1);
    }

    @Test
    public void getRoot() {
        assertEquals(2.0, Calculator.getRoot(64.0, 6.0), 0.1);
    }

    @Test
    public void calculateSum() {
        assertEquals(6.0, Calculator.calculate("2.0+4.0"), 0.1);
    }

    @Test
    public void calculateSubtraction() {
        assertEquals(2.0, Calculator.calculate("4.0- 2"), 0.1);
    }

    @Test
    public void calculateMultiple() {
        assertEquals(8.0, Calculator.calculate("4 *2.0"), 0.1);
    }

    @Test
    public void calculateDivide() {
        assertEquals(2.0, Calculator.calculate("4.0 / 2.0"), 0.1);
    }

    @Test
    public void calculateExponentiation() {
        assertEquals(16.0, Calculator.calculate("4.0 ^ 2.0"), 0.1);
    }

    @Test
    public void calculateRoot() {
        assertEquals(2.0, Calculator.calculate("64.0 # 6.0"), 0.1);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testUOException() throws UnsupportedOperationException {
        assertEquals(2.0, Calculator.calculate("64.0 & 6.0"), 0.1);
    }
}