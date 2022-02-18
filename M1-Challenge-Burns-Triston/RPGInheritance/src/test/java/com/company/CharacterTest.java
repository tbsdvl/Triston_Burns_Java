package com.company;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CharacterTest {

    Character character;
    Character farmer;

    @Before
    public void setUp() {
        character = new Character();
        character.setName("OP Character");
        character.setHealth(200);
        character.setStamina(200);
        character.setAttackPower(50);
        character.setStrength(100);
        character.setSpeed(200);
        character.setRunning(false);
        farmer = new Farmer("McDonald");
    }

    @Test
    public void shouldDecreaseFarmerHealthUsingAttackCharacter() {
        character.attackCharacter(farmer);
        assertEquals(50, farmer.getHealth());
    }
}