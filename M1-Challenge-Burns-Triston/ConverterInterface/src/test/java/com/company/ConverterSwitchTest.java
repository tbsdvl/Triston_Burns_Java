package com.company;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ConverterSwitchTest {
    ConverterSwitch convertSwitch;

    @Before
    public void setUp() {
        convertSwitch = new ConverterSwitch();
    }

    @Test
    public void shouldReturnAMonth() {
        assertEquals("January", convertSwitch.convertMonth(1));
        assertEquals("May", convertSwitch.convertMonth(5));
        assertEquals("December", convertSwitch.convertMonth(12));
    }

    @Test
    public void shouldReturnADay() {
        assertEquals("Sunday", convertSwitch.convertDay(1));
        assertEquals("Wednesday", convertSwitch.convertDay(4));
        assertEquals("Saturday", convertSwitch.convertDay(7));
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowIllegalArgumentException() {
        convertSwitch.convertMonth(13);
        convertSwitch.convertMonth(-1);
    }

}