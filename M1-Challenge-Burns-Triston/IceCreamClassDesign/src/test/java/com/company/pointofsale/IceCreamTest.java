package com.company.pointofsale;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class IceCreamTest {
    private IceCream iceCream;
    private PrintStream output = System.out;
    private ByteArrayOutputStream outputConverter = new ByteArrayOutputStream();

    @Before
    public void setUp() {
        iceCream = new IceCream("Chocolate", 2.43, 10);
    }

    @Test
    public void shouldReturnADoubleForPriceTimesQuantity() {
        assertEquals(24.3, iceCream.computePriceByQuantity(), 0.0001);
    }

    @Test
    public void shouldReturnADoubleForPricePerUnitSold() {
        assertEquals(0.243, iceCream.computeAverageSellingPrice(), 0.0001);
    }

    @Test
    public void shouldPrintIceCreamInformation() {
        String message = "| Flavor: Chocolate Price: 2.43 Quantity in Stock: 10 |";
        assertEquals(message, iceCream.printMenuItem());
    }
}