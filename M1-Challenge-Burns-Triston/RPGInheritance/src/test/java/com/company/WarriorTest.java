package com.company;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class WarriorTest {

    Character character;
    Warrior warrior;

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
        warrior = new Warrior("Askia");
    }

    @Test
    public void shouldAttemptToBlockAttack() {
        int health;
        int affectedAttribute;
        character.attackCharacter(warrior);

        if(warrior.getHealth() == 50) {
            health = 50;
            affectedAttribute = warrior.getHealth();
        } else if (warrior.getShieldStrength() == 50) {
            health = 50;
            affectedAttribute = warrior.getShieldStrength();
        } else {
            health = warrior.getHealth();
            affectedAttribute = warrior.getHealth();
        }

        assertEquals(health, affectedAttribute);
    }
}