package com.company;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ConverterIfTest {
    ConverterIf convertIf;

    @Before
    public void setUp() { convertIf = new ConverterIf(); }

    @Test
    public void shouldReturnAMonth() {
        assertEquals("May", convertIf.convertMonth(5));
        assertEquals("June", convertIf.convertMonth(6));
        assertEquals("December", convertIf.convertMonth(12));
    }

    @Test
    public void shouldReturnADay() {
        assertEquals("Sunday", convertIf.convertDay(1));
        assertEquals("Wednesday", convertIf.convertDay(4));
        assertEquals("Saturday", convertIf.convertDay(7));
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowAnIllegalArgumentException() {
        convertIf.convertMonth(13);
        convertIf.convertMonth(-1);
        convertIf.convertMonth(1000);
        convertIf.convertDay(0);
        convertIf.convertDay(-5);
        convertIf.convertDay(10);
    }

}