package com.company.factory;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class IceCreamTest {

    private IceCream iceCream;

    @Before
    public void setUp() {
        iceCream = new IceCream();
        iceCream.setFlavor("Vanilla");
        iceCream.setSalePrice(4.50);
        iceCream.setProductionCost(1.15);
        iceCream.setProductionTime(2);
        iceCream.setIngredients(new ArrayList<String>(Arrays.asList("Milk", "Sugar", "Vanilla Extract", "Rock Salt")));
    }

    @Test
    public void shouldReturnADoubleForProductionCostPerMinute() {
        assertEquals(2.3, iceCream.computeProductionCostPerMinute(), 0.0001);

        iceCream.setProductionCost(4.50);
        iceCream.setProductionTime(3);
        assertEquals(13.5, iceCream.computeProductionCostPerMinute(), 0.0001);

        iceCream.setProductionCost(0.3);
        iceCream.setProductionTime(1);
        assertEquals(0.3, iceCream.computeProductionCostPerMinute(), 0.0001);
    }

    @Test
    public void shouldReturnADoubleForComputingANewDiscountedSalePrice() {
        assertEquals(3.15, iceCream.discountSalePrice(0.3), 0.0001);

        iceCream.setSalePrice(3.00);
        assertEquals(1.50, iceCream.discountSalePrice(0.5), 0.0001);

        iceCream.setSalePrice(5.43);
        assertEquals(1.629, iceCream.discountSalePrice(0.7), 0.0001);
    }

    @Test
    public void shouldReturnADoubleComputingTheUnitsGrossProfit() {
        assertEquals(0.7444, iceCream.computeGrossProfitPerUnit(), 0.0001);

        iceCream.setSalePrice(3.67);
        iceCream.setProductionCost(0.75);
        assertEquals(0.7956, iceCream.computeGrossProfitPerUnit(), 0.0001);

        iceCream.setSalePrice(2.87);
        iceCream.setProductionCost(1.13);
        assertEquals(0.6062, iceCream.computeGrossProfitPerUnit(), 0.0001);
    }
}