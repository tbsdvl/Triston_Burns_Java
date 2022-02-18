package com.company;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class FarmerTest {

    Farmer farmer;

    @Before
    public void setUp() {
        farmer = new Farmer("MacDonald");
    }

    @Test
    public void shouldReturnListOfPlowedCrops() {
        List<String> crops = new ArrayList<String>(Arrays.asList("Wheat", "Cabbage", "Beans", "Pumpkin"));

        assertEquals(crops, farmer.plowCrops(crops));
        assertEquals(false, farmer.isPlowing());
    }

    @Test
    public void shouldReturnAStringRepresentingACrop() {
        String crop = "Wheat";

        assertEquals(crop, farmer.harvestCrop(crop));
        assertEquals(true, farmer.isHarvesting());
    }
}