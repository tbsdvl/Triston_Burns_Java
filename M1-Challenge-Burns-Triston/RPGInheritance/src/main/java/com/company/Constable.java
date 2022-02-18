package com.company;

public class Constable extends Character {
    private String jurisdiction;

    public Constable(String name) {
        this.setName(name);
        this.setStrength(60);
        this.setHealth(100);
        this.setStamina(60);
        this.setSpeed(20);
        this.setAttackPower(5);
    }

    public Constable(String name, String jurisdiction) {
        this.setName(name);
        this.setStrength(60);
        this.setHealth(100);
        this.setStamina(60);
        this.setSpeed(20);
        this.setAttackPower(5);
        this.setJurisdiction(jurisdiction);
    }

    public void arrestCriminal(Character criminal) {
        criminal.arrested = true;
    }

    public void releaseCriminal(Character criminal) {
        criminal.arrested = false;
    }

    public String getJurisdiction() {
        return jurisdiction;
    }

    public void setJurisdiction(String jurisdiction) {
        this.jurisdiction = jurisdiction;
    }
}
