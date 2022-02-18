package com.company;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ConstableTest {

    Warrior warrior;
    Constable constable;

    @Before
    public void setUp() {
        constable = new Constable("Marshall Willenholly");
        warrior = new Warrior("Askia");
    }

    @Test
    public void shouldReturnTrueForWarriorIsArrested() {
        constable.arrestCriminal(warrior);

        assertEquals(true, warrior.isArrested());
    }

    @Test
    public void shouldReturnFalseForWarriorIsArrested() {
        constable.arrestCriminal(warrior);
        constable.releaseCriminal(warrior);

        assertEquals(false, warrior.isArrested());
    }

    @Test
    public void shouldReturnConstableJurisdiction() {
        String jurisdiction = "Pima County";
        constable.setJurisdiction(jurisdiction);

        assertEquals(jurisdiction, constable.getJurisdiction());
    }


}