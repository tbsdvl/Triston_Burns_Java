package com.company;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {
    private Calculator calc;

    @Before
    public void setUp() {
        calc = new Calculator();
    }

    @Test
    public void shouldAddTwoIntegersAndReturnAnInteger() {
        assertEquals(4, calc.add(2, 2));
        assertEquals(1, calc.add(1, 0));
        assertEquals(0, calc.add(0, 0));
        assertEquals(100, calc.add(50, 50));
        assertEquals(7, calc.add(4, 3));
    }

    @Test
    public void shouldAddTwoDoublesAndReturnADouble() {
        assertEquals(4.0, calc.add(2.0, 2.0), 0.0001);
        assertEquals(12.3, calc.add(6.2, 6.1), 0.0001);
        assertEquals(45.73, calc.add(40.03, 5.7), 0.0001);
        assertEquals(20.4531, calc.add(14.0501, 6.4030), 0.0001);
    }

    @Test
    public void shouldSubtractTwoIntegersAndReturnAnInteger() {
        assertEquals(-1, calc.subtract(2, 3));
        assertEquals(17, calc.subtract(25, 8));
        assertEquals(0, calc.subtract(100, 100));
    }

    @Test
    public void shouldSubtractTwoDoublesAndReturnADouble() {
        assertEquals(-1.0, calc.subtract(2.0, 3.0), 0.0001);
        assertEquals(5.0, calc.subtract(10.0, 5.0), 0.0001);
        assertEquals(20.7, calc.subtract(28.9, 8.2), 0.0001);
        assertEquals(14.7564, calc.subtract(21.8566, 7.1002), 0.0001);
    }

    @Test
    public void shouldMultiplyTwoIntegersAndReturnAnInteger() {
        assertEquals(25, calc.multiply(5, 5));
        assertEquals(0, calc.multiply(0, 30));
        assertEquals(49, calc.multiply(7, 7));
        assertEquals(81, calc.multiply(9, 9));
        assertEquals(100, calc.multiply(10, 10));
    }

    @Test
    public void shouldMultiplyTwoDoublesAndReturnADouble() {
        assertEquals(18.0, calc.multiply(6.0, 3.0), 0.0001);
        assertEquals(9.0, calc.multiply(3.0, 3.0), 0.0001);
        assertEquals(21.5024, calc.multiply(3.05, 7.05), 0.0001);
        assertEquals(39.69, calc.multiply(6.3, 6.3), 0.0001);
    }

    @Test
    public void shouldDivideTwoIntegersAndReturnAnInteger() {
        assertEquals(7, calc.divide(49, 7));
        assertEquals(10, calc.divide(100, 10));
        assertEquals(0, calc.divide(0, 1));
        assertEquals(0, calc.divide(1, 0));
        assertEquals(5, calc.divide(25, 5));
    }

    @Test
    public void shouldDivideTwoDoublesAndReturnADouble() {
        assertEquals(7.0, calc.divide(49.0, 7.0), 0.0001);
        assertEquals(9.0, calc.divide(81.0, 9.0), 0.0001);
        assertEquals(0, calc.divide(0.0, 1.0), 0.0001);
        assertEquals(0, calc.divide(1.0, 0.0), 0.0001);
        assertEquals(0.5, calc.divide(2.5, 5.0), 0.0001);
    }

}